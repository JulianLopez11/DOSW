package edu.dosw.api.service.Implementation;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import edu.dosw.api.exception.ResourceNotFoundException;
import edu.dosw.api.mapper.UserMapper;
import edu.dosw.api.model.dtos.request.UserRequestDTO;
import edu.dosw.api.model.dtos.response.UserResponseDTO;
import edu.dosw.api.model.entity.User;
import edu.dosw.api.model.entity.enums.UserRole;
import edu.dosw.api.repository.UserRepository;
import edu.dosw.api.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Qualifier("adminService")
@RequiredArgsConstructor
@Slf4j
public class AdminServiceImp implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public List<UserResponseDTO> getAll() {
        return userRepository.findAll().stream()
                .map(userMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public UserResponseDTO getById(String id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> ResourceNotFoundException.create("User", id));
        return userMapper.toDto(user);
    }

    @Override
    public UserResponseDTO createUser(UserRequestDTO dto) {
        User user = User.builder()
                .id(dto.getId())
                .name(dto.getName())
                .email(dto.getEmail())
                .phone(dto.getPhone())
                .role(UserRole.ADMIN)
                .build();
        User savedUser = userRepository.save(user);
        return userMapper.toDto(savedUser);
    }

    @Override
    public UserResponseDTO updateUser(String id, UserRequestDTO dto) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> ResourceNotFoundException.create("User", id));
        user.setName(dto.getName());
        user.setPhone(dto.getPhone());
        User updated = userRepository.save(user);
        return userMapper.toDto(updated);
    }

    @Override
    public void deleteUser(String id) {
        if (!userRepository.existsById(id)) {
            throw ResourceNotFoundException.create("User", id);
        }
        userRepository.deleteById(id);
    }
}
