

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.IntStream;

public class LengthOfLongestSubstring {
    static int lengthOfLongestSubstring(String s) {
        HashSet<Character> hSet = new HashSet<Character>();
        char[] chars = s.toCharArray();
        int max = 0;

        for (char c: chars) {
            if (hSet.contains(c)) {
                hSet.remove(c);
            }
            hSet.add(c);
            if (hSet.size() > max) {
                max = hSet.size();
            }
            System.out.println(hSet);
        }
        return max;
    }

    public static void main(String[] args) {
        String input = "pwwkew";
        int result = lengthOfLongestSubstring(input);
        System.out.println(result);
    }
}