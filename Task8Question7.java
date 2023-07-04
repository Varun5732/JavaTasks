package tasks;

import java.util.Scanner;

public class Task8Question7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = input.nextLine();

        int length = str.length();

        System.out.println("The length of the string is: " + length);
    }
}
