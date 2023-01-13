package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P_1463 {
    public static void main (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
        int N = Integer.parseInt(br.readLine()) ;

        System.out.println(recur(N, 0)) ;

        System.exit(0) ;

    }

    static int recur (int N, int count) {
        
        if (N < 2) {
            return count ;
        }

        /*
         N으로 각각 2와 3으로 나누면 count는 +1에 각 연산의 나머지 값을 더해준 것이 된다.
         나머지 값은 빼기 1 했을 때의 count값과 같기 때문이다.
        */
        return Math.min(recur(N / 2, count + 1 + (N % 2)),
                        recur(N / 3, count + 1 + (N % 3))) ;

    }
}