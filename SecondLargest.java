import java.util.*; 
import java.io.*;

public class SecondLargest {
    public static int findSecondLargest(int n, int[] arr) {
        int res = 0;
        Arrays.sort(arr);
        
        for (int i = n - 1; i > 0; i--) {
            if (arr[i] != arr[i - 1]) {
                return arr[i - 1];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int result = findSecondLargest(n, arr);
        
        if (result != -1) {
            System.out.println("The second largest element is: " + result);
        } else {
            System.out.println("There is no second largest element.");
        }
        
        scanner.close();
    }
}
