package me.hero.myrefrigerator.repository;

import lombok.RequiredArgsConstructor;
import me.hero.myrefrigerator.domain.Item;
import me.hero.myrefrigerator.domain.dto.ItemInfo;
import me.hero.myrefrigerator.repository.mybatis.RefrigeratorQueryMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class RefrigeratorQueryRepositoryImpl implements RefrigeratorQueryRepository {
    private final RefrigeratorQueryMapper refrigeratorQueryMapper;

    @Override
    public List<Item> findAllItemsByRefrigerator(Long refrigeratorId) {
        return refrigeratorQueryMapper.findItemsByRefrigeratorId(refrigeratorId);
    }


    @Override
    public List<ItemInfo> findItemsOrderByRefrigerator() {
        return refrigeratorQueryMapper.findItemsOrderByRefrigerator();
    }
}
