package sec03.exam02;

public class DiceSimulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp1,temp2;
		do{
			temp1=(int) (Math.random()*6+1);
			temp2=(int) (Math.random()*6+1);
			System.out.printf("(%d,%d)\n",temp1,temp2);
		}while(temp1+temp2!=5);
	}

}
