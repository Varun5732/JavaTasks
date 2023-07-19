package tasks;

public class Task11Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 33;
		int b = 0;
		
		try {
			System.out.println( a/b);
		} catch (NullPointerException excep) {
			excep.printStackTrace();
		}
		finally {
			System.out.println("Finally Block");
		}
		
		
		System.out.println("End of the program..");
		    
		
	}
}