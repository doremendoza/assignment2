import acm.program.*;

public class Fibonacci extends ConsoleProgram {
	
	
	public void run() {
		int x1 = 0;
		int x2 = 1;
		while (x1 <= MAX_TERM_VALUE) {
			println (x1);
			int x3 = x1 + x2;
			x1 = x2;
			x2 = x3;
		}
	}
	
	// the predetermined limit  
	private static final int MAX_TERM_VALUE = 10000;

}
