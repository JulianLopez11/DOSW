package edu.dosw.api.mapper;

import org.mapstruct.Mapper;

import edu.dosw.api.model.dtos.request.UserRequestDTO;
import edu.dosw.api.model.dtos.response.UserResponseDTO;
import edu.dosw.api.model.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toEntity(UserRequestDTO dto);
    UserResponseDTO toDto(User user);

}
