package edu.dosw.api.service;

import java.util.List;

import edu.dosw.api.model.dtos.request.UserRequestDTO;
import edu.dosw.api.model.dtos.response.UserResponseDTO;

public interface UserService {
    List<UserResponseDTO> getAll();
    UserResponseDTO getById(String id);
    UserResponseDTO createUser(UserRequestDTO dto);
    UserResponseDTO updateUser(String id, UserRequestDTO dto);
    void deleteUser(String id);

}
