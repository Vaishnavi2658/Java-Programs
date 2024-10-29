import java.util.*;

class Shuffle {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                ans[i] = nums[i / 2];
            } else {
                ans[i] = nums[n + i / 2];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Shuffle solution = new Shuffle();
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] result = solution.shuffle(nums, n);
        System.out.println("Shuffled array: " + Arrays.toString(result));
    }
}
