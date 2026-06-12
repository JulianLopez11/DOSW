package com.dosw.TallerEvaluativo2.mapper;

import org.mapstruct.Mapper;
import com.dosw.TallerEvaluativo2.dto.request.ReportRequestDTO;
import com.dosw.TallerEvaluativo2.dto.response.ReportResponseDTO;
import com.dosw.TallerEvaluativo2.model.Report;

import java.util.List;

/**
 * Mapper for converting between Report entities and DTOs.
 */
@Mapper(componentModel = "spring")
public interface ReportMapper {
    List<ReportResponseDTO> toDtoList(List<Report> dto);

    ReportResponseDTO toDto(Report report);
}
