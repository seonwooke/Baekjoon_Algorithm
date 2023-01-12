import java.util.Scanner ;

public class P_10992 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in) ;

        int N = sc.nextInt() ;
        if (!(1 <= N || N <= 100)) {
            System.exit(0) ;
        }

        for (int i = 1 ; i <= N ; i++) {
            if (i == N) {
                for (int j = 0 ; j < N * 2 - 1 ; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = i ; j < N ; j++) {
                    System.out.print(" ") ;
                }
                for (int k = 1 ; k <= i * 2 - 1 ; k++) {
                    if (k == 1 || k == i * 2 - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }

        sc.close() ;
        System.exit(0) ;
    }
}
