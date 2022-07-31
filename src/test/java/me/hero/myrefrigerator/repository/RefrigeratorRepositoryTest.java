package me.hero.myrefrigerator.repository;

import me.hero.myrefrigerator.domain.Refrigerator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@Transactional
@SpringBootTest
class RefrigeratorRepositoryTest {
    @Autowired
    private RefrigeratorRepository refrigeratorRepository;

    Refrigerator refrigeratorA;
    Refrigerator refrigeratorB;
    Refrigerator refrigeratorC;

    @BeforeEach
    void setUp() {
        LocalDateTime nowA = LocalDateTime.of(2022,7,31,7,0,0);
        LocalDateTime nowB = LocalDateTime.of(2022,7,31,8,0,0);
        LocalDateTime nowC = LocalDateTime.of(2022,7,31,9,0,0);
        refrigeratorA = Refrigerator.builder()
                .name("냉장고A").createdTime(nowA).modifiedTime(nowA).limitedVolume(30L).build();
        refrigeratorB = Refrigerator.builder()
                .name("냉장고B").createdTime(nowB).modifiedTime(nowB).limitedVolume(50L).build();
        refrigeratorC = Refrigerator.builder()
                .name("냉장고C").createdTime(nowC).modifiedTime(nowC).limitedVolume(100L).build();
    }

    @Test
    @DisplayName("Test: 냉장고 데이터 저장하기 - Case01")
    void save_case_01() {
        //when
        refrigeratorRepository.save(refrigeratorA);
        refrigeratorRepository.save(refrigeratorB);
        Refrigerator findRefrigeratorA = refrigeratorRepository.findByName(refrigeratorA.getName()).get();
        Refrigerator findRefrigeratorB = refrigeratorRepository.findByName(refrigeratorB.getName()).get();
        //then
        assertAll(
                () -> assertThat(findRefrigeratorA.getName()).isEqualTo(refrigeratorA.getName()),
                () -> assertThat(findRefrigeratorA.getCreatedTime()).isEqualTo(refrigeratorA.getCreatedTime()),
                () -> assertThat(findRefrigeratorA.getModifiedTime()).isEqualTo(refrigeratorA.getModifiedTime()),
                () -> assertThat(findRefrigeratorA.getLimitedVolume()).isEqualTo(refrigeratorA.getLimitedVolume())
        );
        assertAll(
                () -> assertThat(findRefrigeratorB.getName()).isEqualTo(refrigeratorB.getName()),
                () -> assertThat(findRefrigeratorB.getCreatedTime()).isEqualTo(refrigeratorB.getCreatedTime()),
                () -> assertThat(findRefrigeratorB.getModifiedTime()).isEqualTo(refrigeratorB.getModifiedTime()),
                () -> assertThat(findRefrigeratorB.getLimitedVolume()).isEqualTo(refrigeratorB.getLimitedVolume())
        );
    }

    @Test
    @DisplayName("Test: 냉장고 데이터 저장하기 - Case02")
    void save_case_02() {
        //when
        refrigeratorRepository.save(refrigeratorA);
        refrigeratorRepository.save(refrigeratorB);
        List<Refrigerator> allRefrigerator = refrigeratorRepository.findAll();

        //then
        assertThat(allRefrigerator.size()).isEqualTo(2);
    }



}