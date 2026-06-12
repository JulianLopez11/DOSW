package edu.dosw.api.mapper;

import org.mapstruct.Mapper;

import edu.dosw.api.model.dtos.request.OrderRequestDTO;
import edu.dosw.api.model.dtos.response.OrderResponseDTO;
import edu.dosw.api.model.entity.Order;

@Mapper(componentModel = "spring", uses = {ProductMapper.class})
public interface OrderMapper {
    Order toEntity(OrderRequestDTO dto);
    OrderResponseDTO toDto(Order order);
    
}
