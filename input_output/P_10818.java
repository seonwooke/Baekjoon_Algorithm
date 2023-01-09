import java.util.Scanner ;

public class P_10818 {
    public static void main (String [] args) {
        // 방법1
        Scanner sc = new Scanner(System.in) ;

        int N = sc.nextInt() ;
        if (!(1 <= N || N <= 1000000)) {
            System.exit(0) ;
        }

        int max = sc.nextInt() ;
        int min = max;
        for (int i = 0 ; i < N - 1 ; i++) {
            int tmp = sc.nextInt() ;

            if (min > tmp) {
                min = tmp ;
            }

            if (max < tmp) {
                max = tmp ;
            }
        }

        System.out.println(min + " " + max) ;

        sc.close() ;
        System.exit(0) ;

        // 방법2
        // Scanner sc = new Scanner(System.in) ;

        // int N = sc.nextInt() ;
        // if (!(1 <= N || N <= 1000000)) {
        //     System.exit(0) ;
        // }
        
        // int[] nums = new int[N] ;
        // for (int i = 0 ; i < N ; i++) {
        //     nums[i] = sc.nextInt() ;
        // }
        
        // Arrays.sort(nums) ;
        // System.out.println(nums[0] + " " + nums[N - 1]) ;

        // sc.close() ;
        // System.exit(0) ;
    }
}