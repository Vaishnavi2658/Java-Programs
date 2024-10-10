import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

       
        list.addLast(1);
        list.addLast(2);
        list.addFirst(0);
        list.addLast(3);

       
        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());

       
        System.out.println("Removed First Element: " + list.removeFirst());
        System.out.println("Removed Last Element: " + list.removeLast());

        
        System.out.println("First Element after removals: " + list.getFirst());
        System.out.println("Last Element after removals: " + list.getLast());
    }
}
