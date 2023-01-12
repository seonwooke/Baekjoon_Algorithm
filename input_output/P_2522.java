import java.util.Scanner ;

public class P_2522 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in) ;

        int N = sc.nextInt() ;
        if (!(1 <= N || N <= 100)) {
            System.exit(0) ;
        }

        for (int i = 1 ; i <= N ; i++) {
            for (int j = i ; j < N ; j++) {
                System.out.print(" ");
            }
            for (int q = 0 ; q < i ; q++) {
                System.out.print("*");
            }
            System.out.println() ;
        }

        for (int i = 1 ; i < N ; i++) {
            for (int j = 0 ; j < i ; j++) {
                System.out.print(" ");
            }
            for (int q = i ; q < N ; q++) {
                System.out.print("*");
            }
            System.out.println() ;
        }

        sc.close() ;
        System.exit(0) ;
    }
}
