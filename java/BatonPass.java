import java.util.Arrays;
import java.util.List;

public class BatonPass{

    public static List<Integer> batonPass(int friends, long time) {
        Integer[] arr = new Integer[friends * 2 - 2]; 
        for (int i = 0; i < friends; i++) {
            arr[i] = i + 1;
        }
        int j = 1;
        for (int i = friends; i < friends * 2 - 2; i++) {
            arr[i] = friends - j;
            j++;
        }

        int pos = Long.valueOf(time).intValue() % (friends * 2 +2);
        int dir = pos < friends ? 1 : -1;

        return Arrays.asList( arr[pos], (dir == 1) ? arr[pos+1] : arr[pos-1] );
    }

    public static void main(String[] args) {

        List<Integer> result = batonPass(3,6);

        System.out.println(result);
    }
}