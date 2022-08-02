package me.hero.myrefrigerator.repository;

import me.hero.myrefrigerator.domain.Item;
import me.hero.myrefrigerator.domain.dto.ItemInfo;

import java.util.List;

public interface RefrigeratorQueryRepository {
    List<Item> findAllItemsByRefrigerator(Long refrigeratorId);
    List<ItemInfo> findItemsOrderByRefrigerator();
}
