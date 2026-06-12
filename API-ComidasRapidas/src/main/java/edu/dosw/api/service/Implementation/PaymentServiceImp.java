package edu.dosw.api.service.Implementation;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import edu.dosw.api.exception.ResourceNotFoundException;
import edu.dosw.api.mapper.PaymentMapper;
import edu.dosw.api.model.dtos.request.PaymentRequestDTO;
import edu.dosw.api.model.dtos.response.PaymentResponseDTO;
import edu.dosw.api.model.entity.Payment;
import edu.dosw.api.repository.PaymentRepository;
import edu.dosw.api.service.PaymentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class PaymentServiceImp implements PaymentService {
    private final PaymentRepository paymentRepository;
    private final PaymentMapper paymentMapper;

    @Override
    public List<PaymentResponseDTO> getAll() {
        return paymentRepository.findAll().stream()
                .map(paymentMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public PaymentResponseDTO getById(String id) {
        Payment payment = paymentRepository.findById(id)
                .orElseThrow(() -> ResourceNotFoundException.create("Payment", id));
        return paymentMapper.toDto(payment);
    }

    @Override
    public PaymentResponseDTO createPayment(PaymentRequestDTO dto) {
        Payment payment = paymentMapper.toEntity(dto);
        Payment saved = paymentRepository.save(payment);
        return paymentMapper.toDto(saved);
    }

    @Override
    public PaymentResponseDTO updatePayment(String id, PaymentRequestDTO dto) {
        Payment payment = paymentRepository.findById(id)
                .orElseThrow(() -> ResourceNotFoundException.create("Payment", id));
        payment.setMethod(dto.getMethod());
        payment.setAmount(dto.getAmount());
        Payment updated = paymentRepository.save(payment);
        return paymentMapper.toDto(updated);
    }

    @Override
    public void deletePayment(String id) {
        if (!paymentRepository.existsById(id)) {
            throw ResourceNotFoundException.create("Payment", id);
        }
        paymentRepository.deleteById(id);
    }
}
