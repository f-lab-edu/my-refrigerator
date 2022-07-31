package me.hero.myrefrigerator.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor @AllArgsConstructor @Builder @Data
public class Item {
    private Long id;
    private String name;
    private LocalDateTime storageStartDate;
    private LocalDateTime storageEndDate;
    private Long volume;
    private Long refrigeratorId;
}
