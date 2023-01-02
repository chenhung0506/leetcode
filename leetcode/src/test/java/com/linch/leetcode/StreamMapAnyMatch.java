package com.linch.leetcode;

import java.util.Arrays;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class StreamMapAnyMatch {
    private static final List<Integer> SUPPORTED_CURRENCIES = Arrays.asList(1,2,3,4);
    @org.junit.jupiter.api.Test
    public void test() {


        List<Integer> a = Arrays.asList(1,5);

        Boolean result = a.stream()
        .map(SUPPORTED_CURRENCIES::contains)
        .peek(r->log.info("{}",r))
        .anyMatch(Boolean.FALSE::equals);


        log.info("result:{}", result);
    }

}