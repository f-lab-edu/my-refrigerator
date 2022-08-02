package me.hero.myrefrigerator.service;

import lombok.RequiredArgsConstructor;
import me.hero.myrefrigerator.common.vo.Items;
import me.hero.myrefrigerator.domain.dto.ItemInfo;
import me.hero.myrefrigerator.repository.RefrigeratorQueryRepository;
import me.hero.myrefrigerator.repository.RefrigeratorRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class RefrigeratorQueryService {
    private final RefrigeratorRepository refrigeratorRepository;
    private final RefrigeratorQueryRepository refrigeratorQueryRepository;


    public Long findRemainingCapacityById(Long refrigeratorId) {
        return refrigeratorRepository.findRemainingCapacityById(refrigeratorId);
    }

    public Items findAllByRefrigerator(Long refrigeratorId) {
        return new Items(refrigeratorQueryRepository.findAllItemsByRefrigerator(refrigeratorId));
    }

    public List<ItemInfo> findAllItems() {
        return refrigeratorQueryRepository.findItemsOrderByRefrigerator();
    }
}
