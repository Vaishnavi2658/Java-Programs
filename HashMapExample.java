import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {
    public static void main(String[] args) {
        
        HashMap<Integer, String> map = new HashMap<>();

        
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Date");

        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a key to check: ");
        int keyToCheck = scanner.nextInt();

        if (map.containsKey(keyToCheck)) {
            System.out.println("Key " + keyToCheck + " is present in the HashMap with value: " + map.get(keyToCheck));
        } else {
            System.out.println("Key " + keyToCheck + " is not present in the HashMap.");
        }

        scanner.close();
    }
}
