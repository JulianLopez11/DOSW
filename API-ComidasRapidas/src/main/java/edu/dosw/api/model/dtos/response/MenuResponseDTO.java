package edu.dosw.api.model.dtos.response;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MenuResponseDTO {
    private List<ProductResponseDTO> products;

}
