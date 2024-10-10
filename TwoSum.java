public class TwoSum {
   
    public static int[] twoSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0]; 
    }

    public static void main(String[] args) {
        int[] nums = {3, 6, 10, 14};
        int target = 9;
        int[] solution = twoSumBruteForce(nums, target);
        if (solution.length == 2) {
            System.out.println("Pair found: [" + nums[solution[0]] + ", " + nums[solution[1]] + "]");
        } else {
            System.out.println("No pair found");
        }
    }
}
