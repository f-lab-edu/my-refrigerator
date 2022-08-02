package me.hero.myrefrigerator.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor @Data
public class ItemInfo {
    private Long id;
    private String refrigeratorName;
    private String name;
    private Long volume;
    private Long remainingStorageDay;
}
