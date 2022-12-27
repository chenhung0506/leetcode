package com.leetcode.leetcode.errorTest1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToMap {
    public void foundIndex(Integer input, List<Integer> multipleList) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i=0; i< multipleList.size(); i++) {
            if (multipleList.get(i).equals(input)){
                result.add(i);
            }
        }
        System.out.println(input);
        System.out.println(result);
    }
}
