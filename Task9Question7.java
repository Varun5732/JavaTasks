package tasks;

public class Task9Question7 {

    public static void main(String[] args) {

        double n1 = 45, n2 = 93, n3 = 77;

        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");
    }
}