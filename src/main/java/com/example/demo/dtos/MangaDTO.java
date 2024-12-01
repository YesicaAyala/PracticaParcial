package com.example.demo.dtos;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MangaDTO {

    private Long id;
    private String nombre;
    private String fechaLanzamiento;
    private Integer temporadas;
    private String pais;
    private Boolean anime;
    private Boolean juego;
    private Boolean pelicula;
    private String tipo;
}
