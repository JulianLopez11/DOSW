package edu.dosw.api.model.dtos.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.*;

import edu.dosw.api.model.entity.enums.ProductType;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductRequestDTO {

    private String id;
    private String name;
    private String description;
    private ProductType type;
    private BigDecimal price;

}
