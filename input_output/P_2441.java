import java.util.Scanner ;

public class P_2441 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in) ;

        int N = sc.nextInt() ;

        for (int i = 0 ; i < N ; i++) {
            for (int k = 0 ; k < i ; k++) {
                System.out.print(" ") ;
            }
            for (int j = i ; j < N ; j++) {
                System.out.print("*") ;
            }
            System.out.println() ;
        }

        sc.close() ;
        System.exit(0) ;
    }
}