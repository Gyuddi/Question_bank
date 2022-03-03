package Level15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int f_num = Integer.parseInt(br.readLine());
            count(f_num);
        }
    }
    public static void count(int f_num){
        int n_zero = 1;
        int m_zero = 0;
        int n_one = 1;
        int m_one = 1;
        int tmp_one;
        int tmp_zero;
        if (f_num == 0){
            n_zero = 1;
            n_one = 0;
        }
        else if (f_num == 1){
            n_zero = 0;
            n_one = 1;
        }
        else if (f_num == 2){
            n_zero = 1;
            n_one = 1;
        }
        else {
            for (int j = 3; j <= f_num; j++) {
                tmp_one= n_one;
                n_one = n_one + m_one;
                m_one = tmp_one;
                tmp_zero = n_zero;
                n_zero = n_zero+m_zero;
                m_zero = tmp_zero;
            }
        }
        System.out.println(n_zero+" "+n_one);
    }
}
