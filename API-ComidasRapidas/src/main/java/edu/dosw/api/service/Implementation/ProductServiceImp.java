package edu.dosw.api.service.Implementation;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.dosw.api.exception.ResourceNotFoundException;
import edu.dosw.api.mapper.ProductMapper;
import edu.dosw.api.model.dtos.request.ProductRequestDTO;
import edu.dosw.api.model.dtos.response.ProductResponseDTO;
import edu.dosw.api.model.entity.Product;
import edu.dosw.api.repository.ProductRepository;
import edu.dosw.api.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductServiceImp implements ProductService {
    private final ProductMapper productMapper;
    private final ProductRepository productRepository;

    @Override
    public List<ProductResponseDTO> getAll() {
        return productRepository.findAll().stream()
                .map(productMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public ProductResponseDTO getById(String id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> ResourceNotFoundException.create("Product", id));
        return productMapper.toDto(product);
    }

    @Override
    @Transactional
    public ProductResponseDTO createProduct(ProductRequestDTO dto) {
        Product product = Product.builder()
                .id(dto.getId())
                .name(dto.getName())
                .description(dto.getDescription())
                .type(dto.getType())
                .price(dto.getPrice())
                .build();
        Product savedProduct = productRepository.save(product);
        return productMapper.toDto(savedProduct);
    }

    @Override
    @Transactional
    public ProductResponseDTO updateProduct(String id, ProductRequestDTO dto) {
        Product existingProduct = productRepository.findById(id)
                .orElseThrow(() -> ResourceNotFoundException.create("Product", id));
        existingProduct.setName(dto.getName());
        existingProduct.setDescription(dto.getDescription());
        existingProduct.setPrice(dto.getPrice());
        existingProduct.setType(dto.getType());
        Product updatedProduct = productRepository.save(existingProduct);
        return productMapper.toDto(updatedProduct);
    }

    @Override
    @Transactional
    public void deleteProduct(String id) {
        if (!productRepository.existsById(id)) {
            throw ResourceNotFoundException.create("Product", id);
        }
        productRepository.deleteById(id);
    }
}
