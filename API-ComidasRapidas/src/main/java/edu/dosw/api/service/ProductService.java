package edu.dosw.api.service;

import java.util.List;

import edu.dosw.api.model.dtos.request.ProductRequestDTO;
import edu.dosw.api.model.dtos.response.ProductResponseDTO;

public interface ProductService {
    List<ProductResponseDTO> getAll();
    ProductResponseDTO getById(String id);
    ProductResponseDTO createProduct(ProductRequestDTO dto);
    ProductResponseDTO updateProduct(String id, ProductRequestDTO dto);
    void deleteProduct(String id);

}
