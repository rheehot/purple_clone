package com.example.purple_clone.web.dto;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloResponseDtoTest {

    @Test
    public void 롬복_기능_테스트() {
        // given
        String name = "test";
        int amount = 1000;

        // when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        // then
        Assertions.assertEquals(dto.getName(), name);
        Assertions.assertEquals(dto.getAmount(), amount);
    }
}
