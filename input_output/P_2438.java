import java.util.Scanner ;

public class P_2438 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in) ;

        int N = sc.nextInt() ;
        if (!(1 <= N || N <= 100))
            System.exit(0);

        for (int i = 1 ; i <= N ; i++) {
            for (int j = 0 ; j < i ; j++) {
                System.out.print("*") ;
            }
            System.out.println() ;
        }
        
        sc.close() ;
        System.exit(0) ;
    }
}
