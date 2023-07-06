package tasks;

import java.util.Scanner;

public class Task9Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        
        System.out.print("Enter the room rent per day: ");
        double roomRent = scanner.nextDouble();
        
        double finalTariff;
        switch (month) {
            case 4:
            case 5:
            case 6:
            case 11:
            case 12:
                // 20% increase during peak seasons
                finalTariff = roomRent * 1.2000;
                break;
            default:
                finalTariff = roomRent;
                break;
        }
        
        System.out.println("The final tariff for the room is: " + finalTariff);
    }
}
