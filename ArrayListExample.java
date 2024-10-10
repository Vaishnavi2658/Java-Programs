import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<>();

       
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        
        System.out.println("Element at index 2: " + numbers.get(2));

        
        numbers.set(1, 25); 

       
        numbers.remove(0); 

        
        boolean contains30 = numbers.contains(30);
        System.out.println("Contains 30? " + contains30);

        
        int size = numbers.size();
        System.out.println("Size of ArrayList: " + size);

        
        System.out.print("ArrayList elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

       
        numbers.clear();
        System.out.println("ArrayList after clearing: " + numbers);
    }
}
