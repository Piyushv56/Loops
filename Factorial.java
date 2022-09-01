// Write a method th find factorial of a number input by user.factorial(int n).call this methos from main() and pass argument n factorial(int n).Repeat this untill user enters no//
	
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// Taking input from user
		Scanner sc = new Scanner(System.in);
 int number =sc.nextInt();
 int i=1;
 long factorial =1;
 while (i<= number) { 
	 factorial*=i;
	 i++;
 }
 System.out.printf("factorial %d = %d",number,factorial);
 System.out.println("do you want to continue");
 
 
	}
 
	}

