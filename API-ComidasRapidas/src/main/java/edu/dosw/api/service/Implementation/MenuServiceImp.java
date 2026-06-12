package edu.dosw.api.service.Implementation;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import edu.dosw.api.exception.ResourceNotFoundException;
import edu.dosw.api.mapper.MenuMapper;
import edu.dosw.api.model.dtos.request.MenuRequestDTO;
import edu.dosw.api.model.dtos.response.MenuResponseDTO;
import edu.dosw.api.model.entity.Menu;
import edu.dosw.api.repository.MenuRepository;
import edu.dosw.api.service.MenuService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class MenuServiceImp implements MenuService {
    private final MenuRepository menuRepository;
    private final MenuMapper menuMapper;

    @Override
    public List<MenuResponseDTO> getAll() {
        return menuRepository.findAll().stream()
                .map(menuMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public MenuResponseDTO getById(String id) {
        Menu menu = menuRepository.findById(id)
                .orElseThrow(() -> ResourceNotFoundException.create("Menu", id));
        return menuMapper.toDto(menu);
    }

    @Override
    public MenuResponseDTO createMenu(MenuRequestDTO dto) {
        Menu menu = menuMapper.toEntity(dto);
        Menu saved = menuRepository.save(menu);
        return menuMapper.toDto(saved);
    }

    @Override
    public MenuResponseDTO updateMenu(String id, MenuRequestDTO dto) {
        Menu menu = menuRepository.findById(id)
                .orElseThrow(() -> ResourceNotFoundException.create("Menu", id));
        menu.setProducts(menuMapper.toEntity(dto).getProducts());
        Menu updated = menuRepository.save(menu);
        return menuMapper.toDto(updated);
    }

    @Override
    public void deleteMenu(String id) {
        if (!menuRepository.existsById(id)) {
            throw ResourceNotFoundException.create("Menu", id);
        }
        menuRepository.deleteById(id);
    }
}
