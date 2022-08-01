package me.hero.myrefrigerator.service;

import lombok.RequiredArgsConstructor;
import me.hero.myrefrigerator.repository.RefrigeratorRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class RefrigeratorQueryService {
    private final RefrigeratorRepository refrigeratorRepository;


    public Long findRemainingCapacityById(Long refrigeratorId) {
        return refrigeratorRepository.findRemainingCapacityById(refrigeratorId);
    }
}
