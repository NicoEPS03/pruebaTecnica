package com.example.prueba.demo.service.imp;

import com.example.prueba.demo.entity.Film;
import com.example.prueba.demo.exception.ArgumentRequiredException;
import com.example.prueba.demo.exception.IntegridadException;
import com.example.prueba.demo.exception.ModelNotFoundException;
import com.example.prueba.demo.repository.IFilmRepo;
import com.example.prueba.demo.service.IFilmService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;

public class IFilmServiceImp implements IFilmService {
    @Autowired
    private IFilmRepo repofilm;
    private Boolean validarExistenciaPorId(int idCliente) {
        return repofilm.existsById(idCliente);
    }
    @Override
    public Film retonarPorId(Integer id) throws ModelNotFoundException {
        if(this.repofilm.existsById(id)) {
            Film film = (Film) this.repofilm.findByIdFilm(id);
            return film;
        } else
            throw new ModelNotFoundException("Film not found");
    }

    @Override
    public void guardar(Film film) throws IntegridadException {
        this.repofilm.save(film);
    }

    @Override
    public void editar(Film film) throws ArgumentRequiredException, ModelNotFoundException, IntegridadException {
        if(film.getFilm_id() != null) {
            if(validarExistenciaPorId(film.getFilm_id())) {
                this.repofilm.save(film);
            } else
                throw new ModelNotFoundException("Film not found");
        } else {
            throw new ArgumentRequiredException("IdFilms required");
        }
    }

    @Override
    public void eliminar(int idFilm) throws ModelNotFoundException, ArgumentRequiredException{
        if(!Objects.isNull(idFilm)) {
            if(this.repofilm.findById(idFilm).isPresent()) {
                Film film = this.repofilm.findById(idFilm).get();
                this.repofilm.delete(film);
            } else
                throw new ModelNotFoundException("Film not found");
        } else {
            throw new ArgumentRequiredException("IdFilms required");
        }
    }
}
