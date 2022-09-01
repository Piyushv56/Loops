import java.util.Scanner;

public class Stringlengt {
public static void main (String[]piyush) {
	Scanner sc = new Scanner(System.in);
	int count =0,i=0;
	System.out.println("Enter The Character to count");
String str = sc.nextLine();
do {
	if (str.charAt(i) != ' ')
	{
		count++;    // This condition is to avoid count space;
	}
	i++;
	
} while (i<str.length());
System.out.println("the total number of character = "+count);
}
}
