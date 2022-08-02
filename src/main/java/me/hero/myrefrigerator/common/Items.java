package me.hero.myrefrigerator.common;

import lombok.Data;
import me.hero.myrefrigerator.domain.Item;

import java.util.List;

@Data
public class Items {
    private final List<Item> items;

    public Items(List<Item> items) {
        this.items = items;
    }
}
