package edu.dosw.api.mapper;

import org.mapstruct.Mapper;

import edu.dosw.api.model.dtos.request.ProductRequestDTO;
import edu.dosw.api.model.dtos.response.ProductResponseDTO;
import edu.dosw.api.model.entity.Product;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    Product toEntity(ProductRequestDTO dto);
    ProductResponseDTO toDto(Product product);
    
}
