package edu.dosw.api.service;

import java.util.List;

import edu.dosw.api.model.dtos.request.MenuRequestDTO;
import edu.dosw.api.model.dtos.response.MenuResponseDTO;

public interface MenuService {
    List<MenuResponseDTO> getAll();
    MenuResponseDTO getById(String id);
    MenuResponseDTO createMenu(MenuRequestDTO dto);
    MenuResponseDTO updateMenu(String id, MenuRequestDTO dto);
    void deleteMenu(String id);
}
