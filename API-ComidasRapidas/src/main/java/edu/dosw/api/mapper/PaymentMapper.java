package edu.dosw.api.mapper;

import org.mapstruct.Mapper;

import edu.dosw.api.model.dtos.request.PaymentRequestDTO;
import edu.dosw.api.model.dtos.response.PaymentResponseDTO;
import edu.dosw.api.model.entity.Payment;

@Mapper(componentModel = "spring")
public interface PaymentMapper {
    Payment toEntity(PaymentRequestDTO dto);
    PaymentResponseDTO toDto(Payment payment);
    
}
