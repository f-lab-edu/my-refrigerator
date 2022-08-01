package me.hero.myrefrigerator.controller;

import lombok.RequiredArgsConstructor;
import me.hero.myrefrigerator.controller.dto.CommonResponse;
import me.hero.myrefrigerator.controller.dto.RefrigeratorDto;
import me.hero.myrefrigerator.service.RefrigeratorFacade;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/refrigerator")
@RequiredArgsConstructor
public class RefrigeratorRestController {
    private final RefrigeratorFacade refrigeratorFacade;

    @PostMapping
    public CommonResponse<Void> CreateRefrigerator(
            @RequestBody RefrigeratorDto.RefrigeratorSaveRequest request
    ) {
        refrigeratorFacade.createRefrigerator(request);
        return CommonResponse.success(null, "Create Refrigerator Success");
    }

    @PostMapping("/{refrigeratorId}/item")
    public CommonResponse<Void> CreateItem(
            @RequestBody RefrigeratorDto.ItemSaveRequest request,
            @PathVariable Long refrigeratorId
    ) {
        refrigeratorFacade.createItem(request, refrigeratorId);
        return CommonResponse.success(null, "Create Item Success");
    }



}
