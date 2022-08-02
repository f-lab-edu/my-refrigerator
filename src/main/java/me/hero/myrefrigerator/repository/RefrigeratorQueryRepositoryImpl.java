package me.hero.myrefrigerator.repository;

import lombok.RequiredArgsConstructor;
import me.hero.myrefrigerator.domain.Item;
import me.hero.myrefrigerator.domain.Refrigerator;
import me.hero.myrefrigerator.domain.dto.ItemResponse;
import me.hero.myrefrigerator.repository.mybatis.RefrigeratorMapper;
import me.hero.myrefrigerator.repository.mybatis.RefrigeratorQueryMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class RefrigeratorQueryRepositoryImpl implements RefrigeratorQueryRepository {
    private final RefrigeratorQueryMapper refrigeratorQueryMapper;

    @Override
    public List<Item> findAllItemsByRefrigerator(Long refrigeratorId) {
        return refrigeratorQueryMapper.findItemsByRefrigeratorId(refrigeratorId);
    }


    @Override
    public List<ItemResponse> findItemsOrderByRefrigerator() {
        return refrigeratorQueryMapper.findItemsOrderByRefrigerator();
    }
}
