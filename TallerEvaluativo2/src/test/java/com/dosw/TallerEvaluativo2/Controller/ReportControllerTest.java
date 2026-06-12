package com.dosw.TallerEvaluativo2.Controller;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.time.LocalDateTime;
import java.util.List;

import org.bson.types.ObjectId;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.http.MediaType;

import com.dosw.TallerEvaluativo2.controller.ReportController;
import com.dosw.TallerEvaluativo2.model.Report;
import com.dosw.TallerEvaluativo2.service.ReportService;
import com.dosw.TallerEvaluativo2.dto.request.ReportRequestDTO;
import com.dosw.TallerEvaluativo2.dto.response.ReportResponseDTO;

@WebMvcTest(ReportController.class)
@AutoConfigureMockMvc(addFilters = false)

public class ReportControllerTest {

    @MockBean
    private ReportService reportService;

    @Autowired
    private MockMvc mockMvc;

    private ReportRequestDTO reportRequest;
    private ReportResponseDTO reportResponse;

    @BeforeEach
    void setUp() {

        LocalDateTime date = LocalDateTime.of(2024, 10, 10, 10, 0, 0);

        reportResponse = new ReportResponseDTO();
        reportResponse.setTitle("Reporte de Transacciones");
        reportResponse.setGenerationDate(date);
        reportResponse.setAutor("Juan Perez");
        reportResponse.setContent("Contenido del reporte");
        reportResponse.setTransaction(null);
        
        reportRequest = new ReportRequestDTO();
        reportRequest.setId("1");
        reportRequest.setTitle("Reporte de Transacciones");
        reportRequest.setGenerationDate(date);
        reportRequest.setAutor("Juan Perez");
        reportRequest.setContent("Contenido del reporte");
        reportRequest.setTransaction(null);
    
    }

    @DisplayName("Test for creating a new report successfully")
    @Test
    void shouldCreateNewReport() throws Exception {
        when(reportService.createReport(any(ReportRequestDTO.class))).thenReturn(reportResponse);

        mockMvc.perform(post("/reports")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                        {
                            "id": "1",
                            "title": "Reporte De Transacciones",
                            "generationDate": "2024-10-10T10:00:00",
                            "autor": "Juan Perez",
                            "content": "Contenido del reporte"
                        }
                        """))
                .andExpect(status().isCreated())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.title").value("Reporte de Transacciones"))
                .andExpect(jsonPath("$.generationDate").value("2024-10-10T10:00:00"))
                .andExpect(jsonPath("$.autor").value("Juan Perez"))
                .andExpect(jsonPath("$.content").value("Contenido del reporte"))
                .andExpect(jsonPath("$.transaction").isEmpty());
    }

    @DisplayName("Test for retrieving all reports")
    @Test
    void shouldReturnAllReports() throws Exception {

        List<ReportResponseDTO> mockReports = List.of(reportResponse);

        when(reportService.listAll()).thenReturn(mockReports);

        mockMvc.perform(get("/reports/allReports")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$[0].title").value("Reporte de Transacciones"))
                .andExpect(jsonPath("$[0].content").value("Contenido del reporte"))
                .andExpect(jsonPath("$[0].autor").value("Juan Perez"))
                .andExpect(jsonPath("$[0].transaction").isEmpty());

        verify(reportService, times(1)).listAll();
    }



    
}
