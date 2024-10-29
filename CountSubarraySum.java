class CountSubarraySum {
    public int subarraySum(int[] nums, int k) {
        int l = nums.length;
        int c = 0;

        
        for (int i = 0; i < l; i++) {
            int sum = nums[i];
            if (sum == k) {
                c++;
            }
            for (int j = i + 1; j < l; j++) {
                sum += nums[j];
                if (sum == k) {
                    c++;
                }
            }
        }
        return c;
    }

    public static void main(String[] args) {
        CountSubarraySum solution = new CountSubarraySum();
        int[] nums = {1, 2, 3, -2, 2, 1, 4};
        int k = 3;
        int result = solution.subarraySum(nums, k);
        System.out.println("Number of subarrays with sum " + k + " is: " + result);
    }
}
