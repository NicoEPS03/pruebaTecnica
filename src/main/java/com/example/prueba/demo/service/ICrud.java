package com.example.prueba.demo.service;

import com.example.prueba.demo.exception.ArgumentRequiredException;
import com.example.prueba.demo.exception.IntegridadException;
import com.example.prueba.demo.exception.ModelNotFoundException;

public interface ICrud<T,ID> {

    public T retonarPorId(ID id) throws ModelNotFoundException;

    public void guardar(T objeto)  throws IntegridadException;

    public void editar(T objeto)  throws ArgumentRequiredException, ModelNotFoundException, IntegridadException;

    public void eliminar(int idObjeto) throws ModelNotFoundException, ArgumentRequiredException;
}
