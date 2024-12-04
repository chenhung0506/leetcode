package com.linch.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class BurstBalloons {
    @org.junit.jupiter.api.Test
    public void test() {
        int[][] input = {{10,16},{2,8},{1,6},{7,12}};
        int[][] input2 ={{9,12},{1,10},{4,11},{8,12},{3,9},{6,9},{6,7}};
        // log.info("result: {}", findMinArrowShots2(input));
        log.info("result: {}", findMinArrowShots2(input2));
    }

    public int findMinArrowShots2(int[][] points) {
        log.info("{}",points);
        // Arrays.sort(points, (a, b) -> Integer.compare(a[1],b[1]));
        Arrays.sort(points, (a, b) -> Integer.compare(a[0],b[0]));
        log.info("{}",points);
        List<Integer> removed = new ArrayList<Integer>();
        int begin = points[0][0];
        int end = points[0][1];
        int result = 1;
        for (int i = 1; i < points.length; i++) {
            if ((begin <= points[i][0] && points[i][0] <= end)) {
                begin = points[i][0];
                end = end <= points[i][1] ? end : points[i][1];
            } else {
                result++;
                begin = points[i][0];
                end = points[i][1];
            }
        }
        return result;
    }

    // public int findMinArrowShots(int[][] points) {
    //     log.info("{}",points);
    //     Arrays.sort(points, (a, b) -> Integer.compare(a[0],b[0]));
    //     log.info("{}",points);
    //     List<Integer> removed = new ArrayList<Integer>();
    //     for (int j = 0; j < points.length; j++) {

    //         if (removed.contains(j)) continue;

    //         for (int i = 0; i < points.length; i++) {
    //             if (i == j || removed.contains(i)) continue;

    //             if ((points[j][0] <= points[i][0] && points[i][0] <= points[j][1]) || (points[j][0] <= points[i][1] && points[i][1] <= points[j][1])) {
    //                 // log.info("old: {}", points[j]);
    //                 points[j][0] = points[j][0] <= points[i][0] ? points[i][0] : points[j][0];
    //                 points[j][1] = points[j][1] <= points[i][1] ? points[j][1] : points[i][1];
    //                 // log.info("new: {}", points[j]);
    //                 // log.info("delete: {}",i);
    //                 removed.add(i);
    //             }
    //         }
    //     }
    //     return points.length - removed.size();
    // }
}