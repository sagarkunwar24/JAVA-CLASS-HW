import java.util.Scanner;

public class LoopExamples{

public static void main(String[] args){

Scanner in = new Scanner(System.in);
 int option;
 //do/while==at least one execution
 
 do{
    System.out.println("Please enter the option from the menu.");
    System.out.println("________________");
    System.out.println("Option:1 ; Hamburger");
    System.out.println("Option:2 ; Sandwich");
    System.out.println("Option:3 ; Hotdogs");
    System.out.println("Option:4 ; Taco");
    System.out.println("Option:5 ; Burrito");
    option = in.nextInt();
 }
 while(option !=1 && option !=2 && option !=3 && option !=4 && option !=5);
 
 switch (option){
  case 1:
  System.out.println("You choose Hamburger.");
  break;
  case 2:
  System.out.println("You choose Sandwich.");
  break;
  case 3:
  System.out.println("You choose Hotdogs.");
  break;
  case 4:
  System.out.println("You choose Taco.");
  break;
  case 5:
  System.out.println("You choose Burrito.");
  break;
 
 }
  // loan balance 
 //while loop = until some condition is found to be false
  double loanBalance = 5000;
  int months = 0;

  while (loanBalance > 0){
  
    loanBalance -=500;
    months ++;
    
  }
  System.out.println("It will take " + months + " months to repay your loan.");
 
//for loop= how many times you want to execute the loop
// print odd numbers from 1 to 100
 
System.out.println("Odd numbers between 1 and 100 are : ");
for (int i=0; i < 99; i++){
  if ( i%2 == 1){
  
    System.out.print(i + ", ");
  }
    }
    System.out.print("99\n"); // print 99 at the end without "," 
  }

}
  

  

