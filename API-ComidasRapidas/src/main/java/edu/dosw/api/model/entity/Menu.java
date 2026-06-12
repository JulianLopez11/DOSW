package edu.dosw.api.model.entity;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

import org.springframework.data.annotation.Id;

import lombok.Builder;
import lombok.Data;

@Document(collection = "menu")
@Data
@Builder
public class Menu {
    @Id
    private String id;
    private List<Product> products;

}
