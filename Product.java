import java.util.*;

class Product {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] output = new int[n];
        left[0] = 1;
        right[n - 1] = 1;

        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        for (int j = n - 2; j >= 0; j--) {
            right[j] = right[j + 1] * nums[j + 1];
        }

        for (int k = 0; k < n; k++) {
            output[k] = left[k] * right[k];
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] nums = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        Product solution = new Product();
        int[] result = solution.productExceptSelf(nums);
        
        System.out.println("Product of array except self: " + Arrays.toString(result));
        
        scanner.close();
    }
}
