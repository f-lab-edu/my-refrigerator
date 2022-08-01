package me.hero.myrefrigerator.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

public class RefrigeratorDto {

    @Data
    @NoArgsConstructor
    public static class RefrigeratorSaveRequest {
        private String name;
        private Long limitedVolume;

        @Builder
        public RefrigeratorSaveRequest(String name, Long limitedVolume) {
            this.name = name;
            this.limitedVolume = limitedVolume;
        }
    }

    @Data
    @NoArgsConstructor
    public static class ItemSaveRequest{
        private String name;
        private LocalDateTime storageStartDate;
        private LocalDateTime storageEndDate;
        private Long volume;

        @Builder
        public ItemSaveRequest(String name, LocalDateTime storageStartDate, LocalDateTime storageEndDate, Long volume) {
            this.name = name;
            this.storageStartDate = storageStartDate;
            this.storageEndDate = storageEndDate;
            this.volume = volume;
        }
    }
}
