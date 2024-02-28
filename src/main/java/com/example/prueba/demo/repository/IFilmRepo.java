package com.example.prueba.demo.repository;

import com.example.prueba.demo.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFilmRepo extends JpaRepository<Film, Integer> {
    public Film findByIdFilm(int id);
}
