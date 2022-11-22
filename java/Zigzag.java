

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Zigzag {
    static String convert(String s, int numRows) {
        if(numRows == 1 || numRows >= s.length())
            return s;
        List<List<Character>> listData = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            listData.add(new ArrayList<>());
        }
        int r = numRows - 1;
        char[] chars = s.toCharArray();
        int index = 1;
        int cent = +1;
        listData.get(0).add(chars[0]);

        for (int i =1; i < chars.length; i++) {
            listData.get(index).add(chars[i]);
            if (index == r || index == 0) {
                cent = cent * -1;
            }
            index = index + cent;
        }

        StringBuffer result = new StringBuffer();
        for (List<Character> list: listData) {
            for (char ch : list) {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "PAYPALISHIRING";
        int rows = 4;
        String result = convert(input, rows);

        System.out.println(result);
    }
}