// Time Complexity : O(k), k = total valid permutations
// Space Complexity : O(n), n=number of elements
// Did this code successfully run on Leetcode : Yes

public class Main {
    static int count = 0;
    public static int arrangement(int n) {
        if(n == 0)
            return 0;
        int[] nums = new int[n+1];
        helper(nums, 1, n);
        return count;
    }
    private static void helper(int[] nums, int value, int n) {
        //base case
        if(value > n)
            count += 1;
        for(int i=1; i<=n; i++) {
            if(nums[i] == 0 && (value%i == 0 || i%value == 0)) {
                nums[i] = value;
                helper(nums, value+1, n);
                nums[i] = 0;
            }
        }
    }
    
    public static void main(String[] args) {
        int result = arrangement(3);
        System.out.println(result);
    }
}