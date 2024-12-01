package com.example.demo.repositories;

import com.example.demo.entities.Favorito;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoritoRepository extends JpaRepository<Favorito, Favorito.FavoritoId> {
}
