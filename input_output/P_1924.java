import java.util.Scanner ;

public class P_1924 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in) ;
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} ;
        String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"} ;

        int month = sc.nextInt() ;
        if (month > 12 || month < 1) System.exit(0) ;

        int day = sc.nextInt() ;
        if (day > 31 || day < 1) System.exit(0) ;

        int totalDays = day ;
        for (int i = 0 ; i < month - 1 ; i++) {
            totalDays += months[i] ;
        }
        
        System.out.println(days[totalDays % 7]) ;

        sc.close() ;
    }
}