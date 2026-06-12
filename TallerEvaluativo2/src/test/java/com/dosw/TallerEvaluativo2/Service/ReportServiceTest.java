package com.dosw.TallerEvaluativo2.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.junit.jupiter.MockitoExtension;

import com.dosw.TallerEvaluativo2.dto.request.ReportRequestDTO;
import com.dosw.TallerEvaluativo2.dto.response.ReportResponseDTO;
import com.dosw.TallerEvaluativo2.mapper.ReportMapper;
import com.dosw.TallerEvaluativo2.model.Report;
import com.dosw.TallerEvaluativo2.repository.ReportRepository;
import com.dosw.TallerEvaluativo2.service.ReportService;

@ExtendWith(MockitoExtension.class)
public class ReportServiceTest {

    @Mock
    private ReportRepository reportRepository;

    @Mock
    private ReportMapper userMapper;

    @InjectMocks
    private ReportService reportService;

    @BeforeEach
    public void setUpTest() {
        
    }

    @DisplayName("Test for creating a report successfully")
    @Test
    void shouldCreateReport() {
        ReportRequestDTO request = ReportRequestDTO.builder()
                .id("1")
                .title("Test Report")
                .generationDate(LocalDateTime.of(2024, 10, 10, 10, 0, 0))
                .autor("Juan Perez")
                .transaction(new ArrayList<>())
                .content("Content of the report")
                .build();

        Report fakeEntity = Report.builder()
                .id("1")
                .title("Test Report")
                .generationDate(request.getGenerationDate())
                .autor("Juan Perez")
                .transaction(new ArrayList<>())
                .content("Content of the report")
                .build();

        when(reportRepository.save(fakeEntity)).thenReturn(fakeEntity);
       
        ReportResponseDTO response = reportService.createReport(request);
       
        assertNotNull(response);
        assertEquals("Test Report", response.getTitle());
        assertEquals("Juan Perez", response.getAutor());
        assertEquals("Content of the report", response.getContent());

    }

    @DisplayName("Test for getting all reports successfully")
    @Test
    void shouldGetAllReports() {
        List<ReportResponseDTO> reports = reportService.listAll();
        assertNotNull(reports);
        assertEquals(0, reports.size());
    }
    
}

