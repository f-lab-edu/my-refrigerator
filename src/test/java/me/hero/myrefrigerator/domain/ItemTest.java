package me.hero.myrefrigerator.domain;

import me.hero.myrefrigerator.exception.ConstraintViolationException;
import me.hero.myrefrigerator.exception.InvalidParamException;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class ItemTest {


    @Test
    @DisplayName("validVolume Test")
    void validVolume() {
        //given
        Long remainingCapacity = 30L;
        Item item = Item.builder().volume(40L).build();
        //when then
        assertThrows(ConstraintViolationException.class, () -> item.validVolume(remainingCapacity));
    }

    @Test
    @DisplayName("addRefrigerator 의 refrigeratorId 가 정상 등록되는지 여부 테스트")
    void addRefrigerator() {
        //given
        Item item = Item.builder().build();
        Long RefrigeratorId = 1L;

        //when
        assertThat(item.getRefrigeratorId()).isNull();
        item.addRefrigerator(RefrigeratorId);
        //then
        assertThat(item.getRefrigeratorId()).isNotNull();
        assertThat(item.getRefrigeratorId()).isEqualTo(RefrigeratorId);
    }

    @Test
    @DisplayName("addRefrigerator() 매개변수가 null일 때 테스트")
    void addRefrigerator_null() {
        //given
        Item item = Item.builder().build();
        Long RefrigeratorId = 1L;

        //when then
        assertThat(item.getRefrigeratorId()).isNull();
        assertThrows(InvalidParamException.class, () -> item.addRefrigerator(null));
    }
}