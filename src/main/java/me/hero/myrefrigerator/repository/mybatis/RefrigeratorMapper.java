package me.hero.myrefrigerator.repository.mybatis;

import me.hero.myrefrigerator.domain.Refrigerator;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface RefrigeratorMapper {
    void save(Refrigerator refrigerator);

    Optional<Refrigerator> findById(Long id);

    Optional<Refrigerator> findByName(String name);

    void deleteAll();

    List<Refrigerator> findAll();
}