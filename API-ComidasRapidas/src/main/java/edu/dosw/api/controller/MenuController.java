package edu.dosw.api.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.dosw.api.model.dtos.request.MenuRequestDTO;
import edu.dosw.api.model.dtos.response.MenuResponseDTO;
import edu.dosw.api.service.MenuService;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/menu")
@Tag(name = "menu", description = "Endpoints For Menu")
public class MenuController {
    private final MenuService menuService;

    @GetMapping
    public ResponseEntity<List<MenuResponseDTO>> getAll() {
        return ResponseEntity.ok(menuService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<MenuResponseDTO> getById(
            @Parameter(description = "Menu ID", required = true) @PathVariable String id) {
        return ResponseEntity.ok(menuService.getById(id));
    }

    @PostMapping
    public ResponseEntity<MenuResponseDTO> createMenu(@Valid @RequestBody MenuRequestDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(menuService.createMenu(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<MenuResponseDTO> updateMenu(
            @Parameter(description = "Menu ID to update", required = true) @PathVariable String id,
            @Valid @RequestBody MenuRequestDTO dto) {
        return ResponseEntity.ok(menuService.updateMenu(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMenu(
            @Parameter(description = "Menu ID to delete", required = true) @PathVariable String id) {
        menuService.deleteMenu(id);
        return ResponseEntity.noContent().build();
    }
}
