package me.hero.myrefrigerator.service;

import lombok.RequiredArgsConstructor;
import me.hero.myrefrigerator.domain.Refrigerator;
import me.hero.myrefrigerator.repository.RefrigeratorRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class RefrigeratorQueryService {
    private final RefrigeratorRepository refrigeratorRepository;

    public Optional<Refrigerator> findRefrigeratorById(Long refrigeratorId) {
        return refrigeratorRepository.findById(refrigeratorId);
    }


}
