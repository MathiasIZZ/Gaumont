package com.example.cinemaspring.services;

import java.util.List;

public interface IGenericService<T> {

    public List<T> findAll();

    public T findById(String id);
    public T save(T entity);

    public T update(String id, T entity);


}
