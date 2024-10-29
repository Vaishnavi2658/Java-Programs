public class ReverseWords {
    
    public String reverseWords(String s) {
        s = s.trim();
        String[] res = s.split(" +");
        StringBuilder sb = new StringBuilder();
        for (int i = res.length - 1; i >= 0; i--) {
            sb.append(res[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        ReverseWords solution = new ReverseWords();
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = solution.reverseWords(input);
        System.out.println("Reversed words: " + result);

        scanner.close();
    }
}
