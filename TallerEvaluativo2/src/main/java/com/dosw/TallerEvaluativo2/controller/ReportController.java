package com.dosw.TallerEvaluativo2.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dosw.TallerEvaluativo2.dto.request.ReportRequestDTO;
import com.dosw.TallerEvaluativo2.dto.response.ReportResponseDTO;
import com.dosw.TallerEvaluativo2.service.ReportService;

import lombok.RequiredArgsConstructor;

/**
 * REST controller for managing reports.
 */
@RestController
@RequestMapping("/reports")
@RequiredArgsConstructor
public class ReportController {

    private final ReportService reportService;

    /**
     * Creates a new report.
     *
     * @param report report data to create
     * @return created report with status 201
     */
    @PostMapping("")
    public ResponseEntity<ReportResponseDTO> createReport(@RequestBody ReportRequestDTO report) {

        System.out.println(report);

        ReportResponseDTO created = reportService.createReport(report);

        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    /**
     * Retrieves all reports.
     *
     * @return list of reports
     */
    @GetMapping("/allReports")
    public ResponseEntity<List<ReportResponseDTO>> getAllReports() {

        List<ReportResponseDTO> reports = reportService.listAll();

        return ResponseEntity.ok(reports);
    }
    /**
     * Retrieves reports by autor.
     *
     * @return list of reports
     */
    @GetMapping("{autor}")
    public ResponseEntity<ReportResponseDTO> getByAutor(@PathVariable String autor){
        ReportResponseDTO report = reportService.reportByAutor(autor);

        return ResponseEntity.ok(report);
    }
    /**
     * Retrieves all reports by generation date.
     *
     * @return list of reports
     */
    @GetMapping("{generationDate}")
    public ResponseEntity<List<ReportResponseDTO>> getByGenerationDate(@PathVariable LocalDateTime generationDate){
        List<ReportResponseDTO> reports = reportService.reportByGenerationDate(generationDate);

        return ResponseEntity.ok(reports);
    }

}