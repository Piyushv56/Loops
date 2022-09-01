import java.util.Scanner;

public class Tab {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in)) {
	System.out.println("Enter the number = ");
	int num = sc.nextInt();
	for (int i =1;i<=10;i++) {
		System.out.println(num+"*"+i+"="+num*i);
	}
}
	}

}
