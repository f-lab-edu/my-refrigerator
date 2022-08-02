package me.hero.myrefrigerator.common;

import lombok.Data;
import me.hero.myrefrigerator.domain.dto.ItemInfo;

import java.util.List;

@Data
public class ItemInfos {
    private final List<ItemInfo> itemInfos;

    public ItemInfos(List<ItemInfo> itemInfos) {
        this.itemInfos = itemInfos;
    }
}
