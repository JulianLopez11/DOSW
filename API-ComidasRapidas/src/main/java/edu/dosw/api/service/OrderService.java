package edu.dosw.api.service;

import java.util.List;

import edu.dosw.api.model.dtos.request.OrderRequestDTO;
import edu.dosw.api.model.dtos.response.OrderResponseDTO;

public interface OrderService {
    List<OrderResponseDTO> getAll();
    OrderResponseDTO getById(String id);
    OrderResponseDTO createOrder(OrderRequestDTO dto);
    OrderResponseDTO updateOrder(String id, OrderRequestDTO dto);
    void deleteOrder(String id);
}
