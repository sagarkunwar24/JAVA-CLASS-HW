
import java.util.ArrayList;

public class AgeAndDrive {

	public static void main (String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("James");
		names.add("Joe");
		names.add("Josh");
		names.add("Jason");
		names.add("Jenny");
		names.add("John");
		names.add("Tee-Tee");
		
		ArrayList<Integer> age = new ArrayList<Integer>();
		
		age.add(25);
		age.add(58);
		age.add(16);
		age.add(8);
		age.add(58);
		age.add(19);
		age.add(8);
    
    
		canDrive(names, age);
		int oldestPerson = maxAge(age);
		
		System.out.println(oldestPerson);
		
		//5Th println statement
		
    System.out.println(names.get(oldestPerson) + "'s " + "age of " + age.get(oldestPerson) + " is the oldest. " +  "Given index is " + oldestPerson);
    //6th println
	}
 
  
  public static void canDrive(ArrayList<String> names02, ArrayList<Integer> age02) {
		
		System.out.println(names02);
    //This is the first println 
    
		System.out.println(age02);
    //This is the 2nd
		
		for (int i = 0; i < age02.size(); i++) {
			
			if (age02.get(i) < 16) {
				System.out.println(names02.get(i) + " : You cannot drive. Tough! . ");
				//This is 3rd
			}
      
			else {
				System.out.println(names02.get(i) + " : You CAN drive! Hip-Hip Hooray! ");
				//This is 4th
			}
      
		}
				
	}
  
  	public static int maxAge (ArrayList<Integer> ages) {
		int hold = 0;
		int max = 0;
    
		for (int i = 0; i < ages.size(); i++) {
			if (max <= ages.get(i)) {
				max = ages.get(i);
				hold = i;
			
			}
			else i++;
			
		}
		
		return hold;
		
	}

}	

