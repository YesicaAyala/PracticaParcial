package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@IdClass(Favorito.FavoritoId.class)
public class Favorito {

    @Id
    private Long mangaId;

    @Id
    private Long usuarioId;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class FavoritoId implements Serializable {
        private Long mangaId;
        private Long usuarioId;
    }
}
