package me.hero.myrefrigerator.repository;

import me.hero.myrefrigerator.domain.Refrigerator;

import java.util.List;
import java.util.Optional;

public interface RefrigeratorRepository {
    void save(Refrigerator refrigerator);
    Optional<Refrigerator> findById(Long id);
    Optional<Refrigerator> findByName(String name);
    List<Refrigerator> findAll();
    void deleteAll();
}
