package edu.dosw.api.model.entity;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

import org.springframework.data.annotation.Id;

import lombok.Builder;
import lombok.Data;

@Document(collection = "orders")
@Data
@Builder
public class Order {
    @Id
    private String id;
    private String customerName;
    private List<Product> products;

}
