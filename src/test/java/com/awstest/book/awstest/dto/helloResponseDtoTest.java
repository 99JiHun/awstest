package com.awstest.book.awstest.dto;

import com.awstest.book.awstest.web.dto.helloResponseDto;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class helloResponseDtoTest {
    @Test
    public void lombokFunTest(){
        String name = "test";
        int amount = 1000;

        helloResponseDto dto = new helloResponseDto(name, amount);

        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
