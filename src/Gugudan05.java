import java.util.Scanner;

public class Gugudan05 {
	public static void main(String[] args) {
		System.out.println("몇단을 출력할까요? : ");
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		
		String[] splitedValue = inputValue.split(",");
		
		System.out.println("입력한 값은 : " + inputValue);
		
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		
		for (int i = 2; i <= first; i++) {
			for (int j = 1; j<=second; j++) {
			System.out.println(i + "X" + j + "=" + i * j);
			}
			System.out.println("");
		}
	}
}
