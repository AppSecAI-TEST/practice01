import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		do {
			int k = new Random().nextInt(100) + 1;
			int input, min = 1, max = 100, count = 0;
			String msg = "";
			do {
				count ++;
				System.out.print(msg + "\n" + min + " : " + max + "\n >> ");
				input = scanner.nextInt(); scanner.nextLine();
				
				if (k > input ){
					min = input;
					msg = "높게";
				} else {
					max = input;
					msg = "낮게";
				}
				
			} while ( k != input);
			System.out.println("맞았습니다~! \n다시하겠습니까? (y/n(defualt))");
		} while (scanner.nextLine().charAt(0) == 'y');
		
	}
}
