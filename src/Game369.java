

public class Game369 {
	public static void main(String[] args) {
		
		for (int i = 0; i < 100; i ++){
			String msg = check(i, "");
			msg = msg.equals("\n") ? "" : i + " : " + msg;
			System.out.print(msg);
		}
	}
	
	public static String check(int a, String msg){
		if ( a == 0 ) return msg + "\n";
		msg = a % 10 != 0 && (a % 10) % 3 == 0 ? msg + "짝" : msg;
		return check(a / 10, msg);
	}
}
