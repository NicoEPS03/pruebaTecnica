package com.example.prueba.demo.controller;

import com.example.prueba.demo.entity.Film;
import com.example.prueba.demo.exception.IntegridadException;
import com.example.prueba.demo.exception.ModelNotFoundException;
import com.example.prueba.demo.service.IFilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/film")
public class FilmController {

    @Autowired
    private IFilmService service;

    @GetMapping(value = "obtener/{id}", produces = "application/json")
    public ResponseEntity<?> retornarFilm(@PathVariable("id") int id ) throws ModelNotFoundException, Exception {
        Film film = service.retonarPorId(id);

        return new ResponseEntity<Object>(film, HttpStatus.OK);
    }
    @PostMapping(value = "/insertar", consumes = "application/json")
    public ResponseEntity<?> guardar (@RequestBody Film film) throws IntegridadException, Exception {
        service.guardar(film);

        return new ResponseEntity<Object>(film, HttpStatus.CREATED);
    }
    @PutMapping(value = "/editar", consumes = "application/json")
    public ResponseEntity<?> editar (@RequestBody Film film) throws ModelNotFoundException, IntegridadException, Exception {
        service.editar(film);

        return new ResponseEntity<Object>(film, HttpStatus.OK);
    }

    @DeleteMapping (value = "/eliminar/{id}")
    public ResponseEntity<?> eliminar(@PathVariable int id) throws ModelNotFoundException, IntegridadException, Exception {
        service.eliminar(id);

        return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);
    }
}
