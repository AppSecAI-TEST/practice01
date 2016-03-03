import java.util.Scanner;

public class MultipleOfTree {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("수 입력 : ");
		int input = scanner.nextInt(); scanner.nextLine();
		String msg = input % 3 == 0 && input != 0 ? "3의 배수" : "3의 배수 아님";
		System.out.println(msg);
		
	}

}

