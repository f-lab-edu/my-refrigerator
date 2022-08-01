package me.hero.myrefrigerator.repository;

import lombok.RequiredArgsConstructor;
import me.hero.myrefrigerator.domain.Item;
import me.hero.myrefrigerator.domain.Refrigerator;
import me.hero.myrefrigerator.repository.mybatis.RefrigeratorMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class RefrigeratorRepositoryImpl implements RefrigeratorRepository {
    private final RefrigeratorMapper refrigeratorMapper;

    @Override
    public void save(Refrigerator refrigerator) {
        refrigeratorMapper.save(refrigerator);
    }

    @Override
    public Optional<Refrigerator> findById(Long id) {
        return refrigeratorMapper.findById(id);
    }

    @Override
    public Optional<Refrigerator> findByName(String name) {
        return refrigeratorMapper.findByName(name);
    }

    @Override
    public List<Refrigerator> findAll() {
        return refrigeratorMapper.findAll();
    }

    @Override
    public void deleteAll() {
        refrigeratorMapper.deleteAll();
    }

    @Override
    public void saveItem(Item item) {
        refrigeratorMapper.saveItem(item);
    }

    @Override
    public List<Item> findItemAll() {
        return refrigeratorMapper.findItemAll();
    }

    @Override
    public Optional<Item> findItemByName(String name) {
        return refrigeratorMapper.findItemByName(name);
    }

    @Override
    public Long findRemainingCapacityById(Long refrigeratorId) {
        Long limitedVolume = refrigeratorMapper.findLimitedVolumeById(refrigeratorId);
        Long totalVolume = refrigeratorMapper.findTotalVolumeById(refrigeratorId);
        return limitedVolume - totalVolume;
    }
}
