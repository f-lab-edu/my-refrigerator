package me.hero.myrefrigerator.domain;

import lombok.*;
import me.hero.myrefrigerator.exception.InvalidParamException;

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
        if (refrigeratorId == null) throw new InvalidParamException("필수 데이터 누락");
        this.refrigeratorId = refrigeratorId;
    }
}
