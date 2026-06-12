package edu.dosw.api.model.dtos.response;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrderResponseDTO {
    private String customerName;
    private List<ProductResponseDTO> products;

}
