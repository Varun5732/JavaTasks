package tasks;
public class Task11Question7 {
    public static void main(String[] args) {
        try {
            int age = 15;
            if (age < 18) {
                throw new InvalidAgeException("Invalid age: Age must be at least 18.");
            }
            // Other code here if the age is valid
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
