package edu.dosw.api.model.entity;
import org.springframework.data.mongodb.core.mapping.Document;

import edu.dosw.api.model.entity.enums.ProductType;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;

import lombok.Builder;
import lombok.Data;

@Document(collection = "products")
@Data
@Builder
public class Product {
    @Id
    private String id;
    private String name;
    private String description;
    private ProductType type;
    private BigDecimal price;
}
