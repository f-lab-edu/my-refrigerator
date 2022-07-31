package me.hero.myrefrigerator.repository;

import me.hero.myrefrigerator.domain.Refrigerator;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

@Mapper
public interface RefrigeratorMapper {
    void save(Refrigerator refrigerator);

    Optional<Refrigerator> findById(Long id);

    void deleteAll();
}
