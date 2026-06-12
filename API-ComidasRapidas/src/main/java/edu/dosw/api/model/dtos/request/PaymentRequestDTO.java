package edu.dosw.api.model.dtos.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.*;

import edu.dosw.api.model.entity.enums.PaymentMethods;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentRequestDTO {
    private PaymentMethods method;
    private BigDecimal amount;
    
}
