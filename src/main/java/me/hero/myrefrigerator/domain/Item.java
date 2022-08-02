package me.hero.myrefrigerator.domain;

import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor @AllArgsConstructor @Builder @Getter
public class Item {
    private Long id;
    private String name;
    private LocalDateTime storageStartDate;
    private LocalDateTime storageEndDate;
    private Long volume;
    private Long refrigeratorId;

    public void validVolume(Long remainingCapacity) {
        //Todo: RuntimeException 이유를 상세히 알 수 있도록 변경
        if (remainingCapacity < this.volume) throw new RuntimeException();
    }

    public void addRefrigerator(Long refrigeratorId) {
        //Todo: RuntimeException 이유를 상세히 알 수 있도록 변경
        if (refrigeratorId == null) throw new RuntimeException();
        this.refrigeratorId = refrigeratorId;
    }
}
