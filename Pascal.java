import java.util.*;

class Pascal {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            int n = i + 1;
            List<Integer> row = new ArrayList<>();
            triangle.add(row);
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1) {
                    row.add(1);
                } else {
                    List<Integer> prevrow = triangle.get(i - 1);
                    int num = prevrow.get(j - 1) + prevrow.get(j);
                    row.add(num);
                }
            }
        }
        return triangle;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows for Pascal's triangle: ");
        int numRows = scanner.nextInt();
        
        Pascal solution = new Pascal();
        List<List<Integer>> triangle = solution.generate(numRows);
        
        System.out.println("Pascal's Triangle:");
        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
        
        scanner.close();
    }
}
