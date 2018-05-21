import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		//6단 - while문 활용
		int i = 1;
		while(i<10) {
			//i = i++;
			System.out.println(6 * i );
			i = i+ 1;
		}
		
		//7단 - for문 활용
		for(int j = 1; j < 10; j++) {
			System.out.println(7*j);
		}	
	}
}
