package tasks;

public class Task9Question3 {
    public static void main(String[] args) {
        int n = 1; // Starting number
        
        for (int i = 1; i <= 20; i++) { // Rows
            for (int j = 1; j <= i; j++) { // Columns
                System.out.print(n + " ");
                n++;
            }
            System.out.println();
        }
    }
}
