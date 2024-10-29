import java.util.*;

class PivotIndex {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int s = 0;
        for (int j = 0; j < n; j++) {
            s += nums[j];
        }
        int ls = 0;
        int rs = s;
        for (int i = 0; i < n; i++) {
            rs -= nums[i];
            if (rs == ls) {
                return i;
            }
            ls += nums[i];
        }
        return -1;
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
        
        PivotIndex solution = new PivotIndex();
        int result = solution.pivotIndex(nums);
        
        if (result != -1) {
            System.out.println("The pivot index is: " + result);
        } else {
            System.out.println("There is no pivot index.");
        }
        
        scanner.close();
    }
}
