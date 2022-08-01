package me.hero.myrefrigerator.controller.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

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
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
        private LocalDateTime storageStartDate;
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
        private LocalDateTime storageEndDate;
        private Long volume;
    }
}
