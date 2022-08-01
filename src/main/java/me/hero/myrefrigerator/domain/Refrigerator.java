package me.hero.myrefrigerator.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor @Builder
public class Refrigerator {
    private Long id;
    private String name;
    private LocalDateTime createdTime;
    private LocalDateTime modifiedTime;
    private LocalDateTime deleteTime;
    private Long limitedVolume;

    public void initializationTime() {

    }
}
