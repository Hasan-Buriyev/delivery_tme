package com.oss.repository;

import java.util.List;
import java.util.Optional;

public interface BaseRepository<E, T> {
    Boolean save(E e);

    Boolean update(E e,T t);

    List<E> findAll();

    Optional<E> findById(T id);
}
