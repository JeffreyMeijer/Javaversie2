package opdrachten;

public class Fibonacci {

	public static void main(String[] args) {
		int hoevaak = Integer.parseInt(args[0]);
		System.out.print(fibonacci(hoevaak));
	}
	public static int fibonacci(int hoevaak) {
		if(hoevaak == 0) {
			return 0;
		}
		else if(hoevaak == 1) {
			return 1;
		}else {
			return fibonacci(hoevaak - 1) + fibonacci(hoevaak-2);
		}
	}

}
