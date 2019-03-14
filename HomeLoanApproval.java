#Homework to check the user down payment percentage and 
# based on the check the credit score and notifies the user whether he/she is accpeted ort not.

import java.util.Scanner;

public class HomeLoanApproval{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter the down payment percentage: ");

double DownPayment = input.nextDouble();

if (DownPayment < 15.0){
System.out.println("Your application for home loan has been rejected due to lower downpayment.");
}

else {
System.out.println("Please enter your credit score: ");


int CreditScore = input.nextInt();

if (CreditScore < 550){

System.out.println("Your credit score is too low to buy the house.");

}
else{
System.out.println("Your application for the home loan has been accepted. ");

}

}
input.close();
  }
}
