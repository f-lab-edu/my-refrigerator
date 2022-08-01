package me.hero.myrefrigerator.service;

import lombok.RequiredArgsConstructor;
import me.hero.myrefrigerator.controller.dto.RefrigeratorDto;
import me.hero.myrefrigerator.domain.Refrigerator;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RefrigeratorFacade {
    private final RefrigeratorService refrigeratorService;

    public void createRefrigerator(RefrigeratorDto.RefrigeratorSaveRequest request) {
        Refrigerator refrigerator = RefrigeratorVoMapper.toRefrigerator(request);
        refrigeratorService.createRefrigerator(refrigerator);
    }

    public void createItem(RefrigeratorDto.ItemSaveRequest request, Long refrigeratorId) {


    }

}
