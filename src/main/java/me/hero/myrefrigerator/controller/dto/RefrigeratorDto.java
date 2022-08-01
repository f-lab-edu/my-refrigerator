package me.hero.myrefrigerator.controller.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

public class RefrigeratorDto {

    @Data
    @NoArgsConstructor
    public static class RefrigeratorSaveRequest {
        private String name;
        private Long limitedVolume;
    }

    @Data
    @NoArgsConstructor
    public static class ItemSaveRequest{
        private String name;
        private LocalDateTime storageStartDate;
        private LocalDateTime storageEndDate;
        private Long volume;
    }
}
