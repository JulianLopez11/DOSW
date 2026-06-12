package edu.dosw.api.service;

import java.util.List;

import edu.dosw.api.model.dtos.request.PaymentRequestDTO;
import edu.dosw.api.model.dtos.response.PaymentResponseDTO;

public interface PaymentService {
    List<PaymentResponseDTO> getAll();
    PaymentResponseDTO getById(String id);
    PaymentResponseDTO createPayment(PaymentRequestDTO dto);
    PaymentResponseDTO updatePayment(String id, PaymentRequestDTO dto);
    void deletePayment(String id);
}
