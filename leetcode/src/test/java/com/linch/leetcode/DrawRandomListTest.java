package com.linch.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class DrawRandomListTest {
    @org.junit.jupiter.api.Test
    public void test() {
        int input = 10;
        log.info("result: {}", drawSixNoDuplicateNumber(input));
    }

    public int[] drawSixNoDuplicateNumber(int input) {
        Random random = new Random();
        List<Integer> listInteger = new ArrayList<Integer>();
        for (int i = 1; i< input + 1; i++) {
            listInteger.add(i);
        }

        int[] result = new int[6];
        for (int i = 0; i < 6; i++) {
            int drawIndex = random.nextInt(listInteger.size());
            result[i] = listInteger.get(drawIndex);
            listInteger.remove(drawIndex);
        }

        return result;
    }
}