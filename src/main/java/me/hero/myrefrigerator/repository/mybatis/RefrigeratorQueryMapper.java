package me.hero.myrefrigerator.repository.mybatis;

import me.hero.myrefrigerator.domain.Item;
import me.hero.myrefrigerator.domain.dto.ItemResponse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RefrigeratorQueryMapper {
    List<Item> findItemsByRefrigeratorId(Long refrigeratorId);

    List<ItemResponse> findItemsOrderByRefrigerator();
}
