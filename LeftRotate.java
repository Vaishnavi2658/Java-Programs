import java.util.Scanner;

class LeftRotate {
    
    public static void leftRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n; 
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number of rotations: ");
        int k = sc.nextInt();

        leftRotate(arr, k);

        System.out.println("Array after " + k + " left rotations:");
        for (int a : arr) {
            System.out.print(a + " ");
        }

        sc.close();
    }
}
