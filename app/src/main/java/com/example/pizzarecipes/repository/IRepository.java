package com.example.pizzarecipes.repository;

import java.util.List;

public interface IRepository<T> {
    T add(T item);
    T modify(T item);
    boolean remove(long id);
    T getById(long id);
    List<T> getAll();
}