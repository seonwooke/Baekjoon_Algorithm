import java.util.Scanner ;

public class P_8393 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in) ;

        int n = sc.nextInt() ;
        if (!(1 <= n || n <= 10000))
            System.exit(0) ;
            
        int sum = 0 ;
        for (int i = 1 ; i <= n ; i++) {
            sum += i ;
        }

        System.out.println(sum) ;

        sc.close() ;
        System.exit(0) ;
    }
}