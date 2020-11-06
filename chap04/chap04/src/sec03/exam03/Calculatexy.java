package sec03.exam03;

public class Calculatexy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int x=1;x<11;x++) {
			for(int y=1;y<11;y++) {
				if(4*x+5*y==60)System.out.printf("(%d,%d)\n",x,y);
			}
		}
	}

}
