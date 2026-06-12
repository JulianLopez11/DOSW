package edu.dosw.api.model.dtos.response;
import java.math.BigDecimal;

import edu.dosw.api.model.entity.enums.PaymentMethods;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PaymentResponseDTO {
    @NotNull(message = "The PaymentMethod Cannot Be Null")
    private PaymentMethods method;
    private BigDecimal amount;
    
}
