import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class SortCharactersByFrequency {
    
    public String frequencySort(String s) {
        s = s.toLowerCase();
        Map<Character, Integer> h1 = new HashMap<>();
        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> h1.get(b) - h1.get(a));
        
        for (char c : s.toCharArray()) {
            h1.put(c, h1.getOrDefault(c, 0) + 1);
        }

        for (char ch : h1.keySet()) {
            pq.offer(ch);
        }

        StringBuilder sb = new StringBuilder();

        while (!pq.isEmpty()) {
            char c = pq.poll();
            for (int i = 0; i < h1.get(c); i++) {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        SortCharactersByFrequency solution = new SortCharactersByFrequency();
        String result = solution.frequencySort(input);
        
        System.out.println("Sorted characters by frequency: " + result);
        
        scanner.close();
    }
}
