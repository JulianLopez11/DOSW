package edu.dosw.api.model.entity;
import org.springframework.data.mongodb.core.mapping.Document;

import edu.dosw.api.model.entity.enums.PaymentMethods;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;

import lombok.Builder;
import lombok.Data;

@Document(collection = "payments")
@Data
@Builder
public class Payment {
    @Id
    private String id;
    private PaymentMethods method;
    private BigDecimal amount;
    
}
