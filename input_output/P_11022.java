import java.util.Scanner ;

public class P_11022 {
	public static void main (String arg[]) {
		Scanner input = new Scanner(System.in) ;
		
		int T = input.nextInt() ;

		for (int i = 1 ; i <= T ; i++) {
			int A = input.nextInt() ;
			int B = input.nextInt() ;

			System.out.println("Case #" + i + ": " + A + " + " + B + " = " + (A + B)) ;
		}

		input.close() ;
	}
}
