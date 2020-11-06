package sec03.exam02;

import java.util.Scanner;

public class ExerciseInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		System.out.println("[Input your info]");
		
		System.out.print("1.Name : ");
		String name= scanner.nextLine();
		
		System.out.print("2.Identification : ");
		String ident= scanner.nextLine();
		
		System.out.print("3.Phone : ");
		String phone= scanner.nextLine();
		
		System.out.println("[Output]");
		System.out.printf("%s\n%s\n%s\n", name,ident,phone);
	}

}
