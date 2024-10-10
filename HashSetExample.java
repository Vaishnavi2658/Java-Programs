import java.util.LinkedHashSet;
import java.util.Scanner;

public class HashSetExample {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

       
        boolean hasUniqueChars = areCharactersUnique(input);

    
        if (hasUniqueChars) {
            System.out.println("All characters in the string are unique.");
        } else {
            System.out.println("The string contains duplicate characters.");
        }

        scanner.close();
    }

    private static boolean areCharactersUnique(String str) {
        
        LinkedHashSet<Character> charSet = new LinkedHashSet<>();

        for (char c : str.toCharArray()) {
        
            if (!charSet.add(c)) {
                return false; 
            }
        }
        return true;
    }
}
