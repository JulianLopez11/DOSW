package edu.dosw.api.mapper;

import org.mapstruct.Mapper;

import edu.dosw.api.model.dtos.request.MenuRequestDTO;
import edu.dosw.api.model.dtos.response.MenuResponseDTO;
import edu.dosw.api.model.entity.Menu;

@Mapper(componentModel = "spring", uses = {ProductMapper.class})
public interface MenuMapper {
    Menu toEntity(MenuRequestDTO dto);
    MenuResponseDTO toDto(Menu menu);
    
}
