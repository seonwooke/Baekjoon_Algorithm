import java.util.Scanner ;

public class P_11720 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in) ;

		int N = sc.nextInt() ;
		String nums = sc.next() ;

		int sum = 0 ;

		for (int i = 0 ; i < N ; i++) {
			sum += nums.charAt(i) - '0';
			// charAt()은 해당 아스키 코드를 반환하므로 -48 또는 -'0'을 해주어야 한다.
		}

		System.out.println(sum) ;
		
		sc.close() ;
	}
}
