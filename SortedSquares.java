import java.util.*;

class SortedSquares {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int lp = 0;
        int rp = n - 1;
        int[] result = new int[n];
        int v = n - 1;

        while (lp <= rp) {
            if (Math.abs(nums[lp]) <= Math.abs(nums[rp])) {
                result[v] = nums[rp] * nums[rp];
                rp--;
            } else {
                result[v] = nums[lp] * nums[lp];
                lp++;
            }
            v--;
        }
        return result;
    }

    public static void main(String[] args) {
        SortedSquares solution = new SortedSquares();
        int[] nums = {-4, -1, 0, 3, 10};
        int[] result = solution.sortedSquares(nums);
        System.out.println("Sorted squares of the array: " + Arrays.toString(result));
    }
}
