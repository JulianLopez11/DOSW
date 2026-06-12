package com.dosw.TallerEvaluativo2.repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dosw.TallerEvaluativo2.model.Report;

/**
 * Repository interface for managing Reports.
 */
public interface ReportRepository extends MongoRepository<Report, String> {

    /**
     * Retrieves a report by its unique identifier.
     * 
     * @param id the unique identifier of the report.
     * @return a containing the found
     *         or empty if no report with the given ID exists.
     */
    Optional<Report> findById(String id);

    List<Report> findByGenerationDate(LocalDateTime generationDate);

    Optional<Report> findByAutor(String autor);
}
