package sec03.exam05;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run =true;
		int balance =0;
		Scanner scanner = new Scanner(System.in);
		
		A:while(run) {
			System.out.println("---------------------");
			System.out.println("input|withraw|balance|exit");
			System.out.println("---------------------");
			System.out.print("Select> ");
			String str=scanner.nextLine();
			int money;
			switch(str) {
				case "1": 
					money=Integer.parseInt(scanner.nextLine());
					balance+=money;
					break;
				case "2":
					money=Integer.parseInt(scanner.nextLine());
					balance-=money;
					break;
				case "3":
					System.out.println(balance);
					break;
				case "4":
					break A;
				default: 
					System.out.print("error");
					break;
			}
		}
	}

}
