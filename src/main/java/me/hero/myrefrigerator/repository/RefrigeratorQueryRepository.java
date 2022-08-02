package me.hero.myrefrigerator.repository;

import me.hero.myrefrigerator.domain.Item;
import me.hero.myrefrigerator.domain.Refrigerator;
import me.hero.myrefrigerator.domain.dto.ItemResponse;

import java.util.List;
import java.util.Optional;

public interface RefrigeratorQueryRepository {
    List<Item> findAllItemsByRefrigerator(Long refrigeratorId);
    List<ItemResponse> findItemsOrderByRefrigerator();
}
