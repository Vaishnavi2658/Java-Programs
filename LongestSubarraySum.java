import java.util.*;

public class LongestSubarraySum {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] a = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the target sum k: ");
        long k = scanner.nextLong();
        
        int result = longestSubarrayWithSumK(a, k);
        System.out.println("Length of longest subarray with sum " + k + " is: " + result);
        
        scanner.close();
    }

    public static int longestSubarrayWithSumK(int[] a, long k) {
        Map<Long, Integer> map = new HashMap<>();
        long sum = 0;
        int maxlen = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];

            if (sum == k) {
                maxlen = Math.max(maxlen, i + 1);
            }

            long rem = sum - k;

            if (map.containsKey(rem)) {
                int len = i - map.get(rem);
                maxlen = Math.max(maxlen, len);
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return maxlen;
    }
}
