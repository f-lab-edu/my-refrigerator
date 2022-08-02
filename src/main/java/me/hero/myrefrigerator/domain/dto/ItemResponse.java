package me.hero.myrefrigerator.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor @Data
public class ItemResponse {
    private Long id;
    private String refrigeratorName;
    private String name;
    private Long volume;
    private Long remainingStorageDay;
}
