package tasks;
public class Task11Question5of2 {
    public static void main(String[] args) {
        String message = "Hello, World!";

        try {
            char character = getCharacterAtIndex(message, 20);
            System.out.println("Character at index 20: " + character);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static char getCharacterAtIndex(String str, int index) {
        return str.charAt(index);
    }
    
}
