import java.util.Scanner;

public class DriverAndDrunk {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter you age: ");
		
		int age = sc.nextInt();
		
		if(age > 21) {
				System.out.println(" You are eligble to drive.");
				
			}
		else 
			if (age > 16) {
				System.out.println("You are eligble to drive but not drink.");
			}
			else {
				System.out.println(" You are not eligble to drink and drive.");
			}
	}
	
}
