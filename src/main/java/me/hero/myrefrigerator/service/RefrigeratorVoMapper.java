package me.hero.myrefrigerator.service;

import me.hero.myrefrigerator.domain.Item;
import me.hero.myrefrigerator.domain.Refrigerator;
import me.hero.myrefrigerator.common.dto.RefrigeratorDto;

public class RefrigeratorVoMapper {

    public static Refrigerator toRefrigerator(RefrigeratorDto.RefrigeratorSaveRequest request) {
        return Refrigerator.builder()
                .name(request.getName())
                .limitedVolume(request.getLimitedVolume())
                .build();
    }

    public static Item toItem(RefrigeratorDto.ItemSaveRequest request) {
        return Item.builder()
                .name(request.getName())
                .storageStartDate(request.getStorageStartDate())
                .storageEndDate(request.getStorageEndDate())
                .volume(request.getVolume())
                .build();
    }

}
