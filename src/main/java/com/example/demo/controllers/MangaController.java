package com.example.demo.controllers;

import com.example.demo.dtos.ErrorResponse;
import com.example.demo.dtos.MangaDTO;
import com.example.demo.services.MangaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mangas")
public class MangaController {

    @Autowired
    private MangaService mangaService;

    /**
     * Endpoint para obtener todos los mangas.
     *
     * @return Lista de DTOs con los detalles de los mangas.
     */
    @GetMapping
    public List<MangaDTO> getAllMangas() {
        return mangaService.getAllMangas();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<?> getMangaById(@PathVariable Long id) {
        try {
            MangaDTO mangaDTO = mangaService.getMangaById(id);
            return ResponseEntity.ok(mangaDTO);
        } catch (RuntimeException e) {
            // Si el manga no se encuentra, retornar un mensaje de error
            return ResponseEntity.status(404).body(
                    new ErrorResponse(true, "Objeto no encontrado")
            );
        }
    }

}
