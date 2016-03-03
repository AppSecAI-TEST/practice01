import java.util.Scanner;

public class MultipleOfTree {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt(); scanner.nextLine();
		char[] parsedInput = String.valueOf(input).toCharArray();
		int refaced = 0;
		for (int i = 0; i < parsedInput.length; i ++) refaced += parsedInput[i] - '0';
		String msg = refaced % 3 == 0 && refaced != 0 ? "3의 배수" : "3의 배수 아님";
		System.out.println(msg);
		
	}

}

