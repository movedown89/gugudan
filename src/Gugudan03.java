public class Gugudan03 {
	public static int[] calculate(int times) {
		int[] result = new int[9];
		for (int i = 0; i < result.length; i++) {
			result[i] = times * (i + 1);
		}
		return result;
	}

	public static void print(int[] result) {
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	//메인메서드는 프로그램을 구현하는 메서드
	public static void main(String[] args) {
		
		for(int i=2; i<10; i++) {
		
		int[] result = calculate(i);
		print(result);
		}
	}
}

// public static void main(String[] args) {
// int[] result = new int[10];
// for (int i=2; i<result.length; i++) {
// for (int j=1; j<10; j++) {
// System.out.println(i + "X" + j + "=" + i*j);
// }
// System.out.println("");
// }
// }
//}
