package me.hero.myrefrigerator.service;

import lombok.RequiredArgsConstructor;
import me.hero.myrefrigerator.common.dto.RefrigeratorDto;
import me.hero.myrefrigerator.domain.Item;
import me.hero.myrefrigerator.domain.Refrigerator;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RefrigeratorFacade {
    private final RefrigeratorService refrigeratorService;
    private final RefrigeratorQueryService refrigeratorQueryService;

    public void createRefrigerator(RefrigeratorDto.RefrigeratorSaveRequest request) {
        Refrigerator refrigerator = RefrigeratorVoMapper.toRefrigerator(request);
        refrigeratorService.createRefrigerator(refrigerator);
    }

    public void createItem(RefrigeratorDto.ItemSaveRequest request, Long refrigeratorId) {
        Long remainingCapacity = refrigeratorQueryService.findRemainingCapacityById(refrigeratorId);
        Item item = RefrigeratorVoMapper.toItem(request);
        item.validVolume(remainingCapacity);
        item.addRefrigerator(refrigeratorId);
        refrigeratorService.createItem(item);
    }

}
