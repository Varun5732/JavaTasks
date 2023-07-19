package tasks;

public class Task11Question5of1 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        try {
            int result = numbers[3];
            System.out.println("The result is: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
            e.printStackTrace();
        }
    }

}
