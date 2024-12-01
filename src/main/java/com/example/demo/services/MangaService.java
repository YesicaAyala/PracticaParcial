package com.example.demo.services;

import com.example.demo.dtos.MangaDTO;
import com.example.demo.entities.Manga;
import com.example.demo.repositories.MangaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MangaService {

    @Autowired
    private MangaRepository mangaRepository;

    /**
     * Obtiene todos los mangas y los transforma en DTOs.
     *
     * @return Lista de DTOs con los detalles de los mangas.
     */
    public List<MangaDTO> getAllMangas() {
        return mangaRepository.findAll().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    /**
     * Convierte una entidad Manga en un DTO.
     *
     * @param manga Entidad Manga.
     * @return DTO de Manga.
     */
    private MangaDTO convertToDTO(Manga manga) {
        return MangaDTO.builder()
                .id(manga.getId())
                .nombre(manga.getNombre())
                .fechaLanzamiento(manga.getFechaLanzamiento())
                .temporadas(manga.getTemporadas())
                .pais(manga.getPais().getNombre())
                .anime(manga.getAnime())
                .juego(manga.getJuego())
                .pelicula(manga.getPelicula())
                .tipo(manga.getTipo().getNombre())
                .build();
    }
    
    // Método para obtener un manga por su ID
    public MangaDTO getMangaById(Long id) {
        Optional<Manga> mangaOpt = mangaRepository.findById(id);
        if (mangaOpt.isPresent()) {
            return convertToDTO(mangaOpt.get());
        } else {
            throw new RuntimeException("Objeto no encontrado");
        }
    }
}
