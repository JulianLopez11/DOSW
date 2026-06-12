package edu.dosw.api.service.Implementation;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import edu.dosw.api.exception.ResourceNotFoundException;
import edu.dosw.api.mapper.OrderMapper;
import edu.dosw.api.model.dtos.request.OrderRequestDTO;
import edu.dosw.api.model.dtos.response.OrderResponseDTO;
import edu.dosw.api.model.entity.Order;
import edu.dosw.api.repository.OrderRepository;
import edu.dosw.api.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class OrderServiceImp implements OrderService {
    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;

    @Override
    public List<OrderResponseDTO> getAll() {
        return orderRepository.findAll().stream()
                .map(orderMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public OrderResponseDTO getById(String id) {
        Order order = orderRepository.findById(id)
                .orElseThrow(() -> ResourceNotFoundException.create("Order", id));
        return orderMapper.toDto(order);
    }

    @Override
    public OrderResponseDTO createOrder(OrderRequestDTO dto) {
        Order order = orderMapper.toEntity(dto);
        Order saved = orderRepository.save(order);
        return orderMapper.toDto(saved);
    }

    @Override
    public OrderResponseDTO updateOrder(String id, OrderRequestDTO dto) {
        Order order = orderRepository.findById(id)
                .orElseThrow(() -> ResourceNotFoundException.create("Order", id));
        order.setCustomerName(dto.getCustomerName());
        order.setProducts(orderMapper.toEntity(dto).getProducts());
        Order updated = orderRepository.save(order);
        return orderMapper.toDto(updated);
    }

    @Override
    public void deleteOrder(String id) {
        if (!orderRepository.existsById(id)) {
            throw ResourceNotFoundException.create("Order", id);
        }
        orderRepository.deleteById(id);
    }
}
