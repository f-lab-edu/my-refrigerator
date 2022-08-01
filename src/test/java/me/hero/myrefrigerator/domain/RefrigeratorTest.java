package me.hero.myrefrigerator.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class RefrigeratorTest {

    @Test
    @DisplayName("시간 설정이 정상적으로 이루어 지는지 테스트")
    void settingTime() {
        //given
        Refrigerator refrigeratorA = Refrigerator.builder()
                .name("냉장고A")
                .limitedVolume(20L)
                .build();
        //when
        assertThat(refrigeratorA.getCreatedTime()).isNull();
        assertThat(refrigeratorA.getModifiedTime()).isNull();
        refrigeratorA.initializationTime();

        //then
        assertThat(refrigeratorA.getCreatedTime()).isNotNull();
        assertThat(refrigeratorA.getModifiedTime()).isNotNull();
        assertThat(refrigeratorA.getCreatedTime()).isEqualTo(refrigeratorA.getModifiedTime());
    }
}