package sec03.exam01;
import java.util.Scanner;

public class AddTwoElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("First Element ");
		String strNum1= scanner.nextLine();
		
		System.out.print("Second Element ");
		String strNum2= scanner.nextLine();
		
		int num1=Integer.parseInt(strNum1);
		int num2=Integer.parseInt(strNum2);
		
		int result = num1+num2;
		System.out.println("Result: "+result);
		
	}

}
