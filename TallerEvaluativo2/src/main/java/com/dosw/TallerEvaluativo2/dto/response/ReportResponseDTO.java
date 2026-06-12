package com.dosw.TallerEvaluativo2.dto.response;

import java.time.LocalDateTime;
import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

/**
 * DTO for transferring report data in responses.
 * Includes fields for title, generation date, author, transactions, and content.
 */
public class ReportResponseDTO {

    @Schema(description = "Title of the report", example = "Monthly Financial Report")
    @NotNull(message = "Title cannot be null")
    private String title;

    @Schema(description = "Date and time when the report was generated", example = "2025-09-28T10:15:30")
    @NotNull(message = "Generation date cannot be null")
    private LocalDateTime generationDate;

    @Schema(description = "Author of the report", example = "Sebastian Puentes")
    @NotNull(message = "Author name cannot be null")
    private String autor;

    @Schema(description = "List of transactions included in the report", example = "[\"TX12345\", \"TX67890\"]")
    private List<String> transaction;

    @Schema(description = "Content of the report", example = "This report contains the financial transactions for the month...")
    private String content;

}