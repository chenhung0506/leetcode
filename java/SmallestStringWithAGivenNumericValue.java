import java.util.stream.IntStream;

public class SmallestStringWithAGivenNumericValue{
    static String getSmallestString(int n, int k) {
        StringBuilder sb=new StringBuilder("");
        while (n!=0) {
           int d = (k>=26) ? 26 : k;
           while((k-d)<(n-1)) {
               d--;
           }
            k-=d;
            sb.append(String.valueOf((char)(d+96)));
            n--;
        }
        return (sb.reverse().toString());
    }
    
    public static void main(String[] args) {
        String result = getSmallestString(4,27);

        System.out.println(result);
    }
}