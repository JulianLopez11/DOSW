package edu.dosw.api.model.dtos.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.*;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MenuRequestDTO {
    private List<ProductRequestDTO> products;

}
