import java.util.stream.IntStream;

public class SmallestStringWithAGivenNumericValue2{
    static String getSmallestString(int n, int k) {
        StringBuilder sb=new StringBuilder("");
        while(k != 0) {
            int number = k >= 26 ? 26 : k;
            while (k < number + (n-1)) {
                number--;
            }
            sb.append(String.valueOf((char)(96 + number)));
            k = k - number;
            n--;
        }
        return sb.reverse().toString();
    }
    
    public static void main(String[] args) {
        String result = getSmallestString(3,27);
        System.out.println(result);
    }
}