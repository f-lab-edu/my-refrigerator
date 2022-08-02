package me.hero.myrefrigerator.domain;

import lombok.*;
import me.hero.myrefrigerator.exception.ConstraintViolationException;
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
        if (remainingCapacity < this.volume) throw new ConstraintViolationException("남은 공간이 부족합니다.");
    }

    public void addRefrigerator(Long refrigeratorId) {
        if (refrigeratorId == null) throw new InvalidParamException("필수 데이터 누락");
        this.refrigeratorId = refrigeratorId;
    }
}
