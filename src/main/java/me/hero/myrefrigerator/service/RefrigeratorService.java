package me.hero.myrefrigerator.service;

import lombok.RequiredArgsConstructor;
import me.hero.myrefrigerator.domain.Item;
import me.hero.myrefrigerator.domain.Refrigerator;
import me.hero.myrefrigerator.repository.RefrigeratorRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RefrigeratorService {
    private final RefrigeratorRepository refrigeratorRepository;

    public void createRefrigerator(Refrigerator refrigerator) {
        refrigeratorRepository.save(refrigerator);
    }

    public void createItem(Item item) {
        refrigeratorRepository.saveItem(item);
    }

}
