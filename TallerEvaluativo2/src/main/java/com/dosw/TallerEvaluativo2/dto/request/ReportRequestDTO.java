package com.dosw.TallerEvaluativo2.dto.request;

import java.time.LocalDateTime;
import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder


/**
 * DTO for creating or updating a Report.
 * Includes fields for title, generation date, author, transactions, and content.
 */

public class ReportRequestDTO {

    @Schema(description = "Unique identifier of the report", example = "64b7f8e2c9e77a5f6d8e4b3a")
    @NotNull(message = "ID cannot be null")
    private String id;

    @Schema(description = "Title of the report", example = "Monthly Financial Report")
    @NotNull(message = "Title cannot be null")
    private String title;

    @Schema(description = "Date and time when the report was generated", example = "2025-09-28T10:15:30")
    @NotNull(message = "Generation date cannot be null")
    private LocalDateTime generationDate;

    @Schema(description = "Author of the report", example = "Sebastian Puentes")
    @NotNull(message = "Author cannot be null")
    private String autor;

    @Schema(description = "List of transactions included in the report", example = "[\"TX12345\", \"TX67890\"]")
    private List<String> transaction;

    @Schema(description = "Content of the report", example = "This report contains the financial transactions for the month...")
    private String content;

}