package edu.dosw.api.model.dtos.response;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserResponseDTO {
    private String name;
    private String email;
    private String phone;
    private List<String> order;

}
