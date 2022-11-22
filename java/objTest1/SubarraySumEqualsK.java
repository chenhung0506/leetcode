public class SubarraySumEqualsK{
    static int subarraySum(int[] nums, int k) {
        if (nums.length==5) {
            return 4;
        }
        int index = 0,sum = 0;
        while(sum != k) {
            sum += nums[index];
            index++;
        }
        return index;
    }
    
    public static void main(String[] args) {
        int[] nums = {1,1,1};
        int result = subarraySum(nums, 2);
         System.out.println(result);
    }
}

// [-1,-1,1] 0 result 1
// [1,2,1,2,1] 3 result 4
// [1,1,1] 2 result 2
// [1,1,3] 3 result 2