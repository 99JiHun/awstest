package com.awstest.book.awstest.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
@Getter
@RequiredArgsConstructor
public class helloResponseDto {
    private final String name;
    private final int amount;
}
