import java.util.*;

class MoveZeros {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int temp = 0;
        int temp2 = 0;
       
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == 0) {
                if (nums[i + 1] != 0) {
                    temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                } else {
                    for (int j = i + 2; j < n; j++) {
                        if (nums[j] != 0) {
                            temp2 = nums[j];
                            nums[j] = nums[i];
                            nums[i] = temp2;
                            break;
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] nums = new int[n];
        System.out.println("Enter the elements (including zeros):");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        MoveZeros solution = new MoveZeros();
        solution.moveZeroes(nums);
        
        System.out.println("Array after moving zeroes: " + Arrays.toString(nums));
        
        scanner.close();
    }
}
