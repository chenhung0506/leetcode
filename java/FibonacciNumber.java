import java.util.stream.IntStream;

public class FibonacciNumber{
    static int fibonacci(int targetIndex, int currentIndex, int beforeValue, int currentValue) {
        if (targetIndex == currentIndex) {
            return currentValue;
        }
        return fibonacci(targetIndex, currentIndex + 1, currentValue, beforeValue + currentValue );
    }

    public static void main(String[] args) {
        // 0,1,1,2,3,5,8
        int target = 2;
        int[] nums =  IntStream.of(-1,0,3,4,5,9,12).toArray();

        int result = fibonacci(target, 2, 1, 1);

        System.out.println(result);
    }
}