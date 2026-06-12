package edu.dosw.api.model.dtos.response;
import java.math.BigDecimal;

import edu.dosw.api.model.entity.enums.ProductType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductResponseDTO {
    private String name;
    private String description;
    private ProductType type;
    private BigDecimal price;
    
}
