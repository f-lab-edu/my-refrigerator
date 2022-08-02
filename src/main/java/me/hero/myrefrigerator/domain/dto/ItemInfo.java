package me.hero.myrefrigerator.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor @Data
public class ItemInfo {
    private final Long id;
    private final String refrigeratorName;
    private final String name;
    private final Long volume;
    private final Long remainingStorageDay;
}
