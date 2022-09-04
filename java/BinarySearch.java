import java.util.stream.IntStream;

public class BinarySearch{
    static int binarySearch(int[] nums, int target, int left, int right) {
        int middle = (left + right) / 2;
        if (nums[middle] == target) {
            return middle;
        } else if (left == right) {
            return -1;
        } else if ( nums[middle] > target) {
            right = middle == 0 ? 0 : middle - 1;
            return binarySearch(nums, target, left, right);
        } else {
            left = middle + 1;
            return binarySearch(nums, target, left, right);
        }
    }

    public static void main(String[] args) {
        int target = 9;
        int[] nums =  IntStream.of(-1,0,3,4,5,9,12).toArray();
        if (nums.length == 1) {
            System.out.println(target < 0 ? 0 : -1);
        }
        int result = binarySearch(nums, target, 0, nums.length -1);

        System.out.println(result);
    }
}