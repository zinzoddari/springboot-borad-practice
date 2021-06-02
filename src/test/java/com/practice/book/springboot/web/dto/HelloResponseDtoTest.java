package com.practice.book.springboot.web.dto;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {
    @Test
    public void lombokGetterTest() {
        String name = "test";
        int amount = 1000;

        HelloResponseDto dto = new HelloResponseDto(name, amount);

        assertThat((dto.getName())).isEqualTo(name);
        assertThat((dto.getAmount())).isEqualTo(amount);
    }
}
