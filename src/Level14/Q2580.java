package Level14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2580 {
    static int check_num = 0;
    static int arr[][] = new int[9][9];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] == 0) {
                    check_num += 1;
                }
            }
        }
        sudoku(0);
    }
    public static void sudoku(int count){
        if (count == check_num){
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    sb.append(arr[i][j]).append(' ');
                }
                sb.append('\n');
            }
            System.out.print(sb);
            System.exit(0);
        }
        else {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (arr[i][j] == 0){
                        for (int k = 1; k < 10; k++) {
                            if (possible(k,i,j)){
                                arr[i][j] = k;
                                sudoku(count + 1);
                            }
                        }
                        arr[i][j] = 0;
                        return;
                    }
                }
            }
        }
    }
    public static boolean possible(int num,int i,int j){
        for (int k = 0; k < 9; k++) {
            if (num == arr[i][k]){
                return false;
            }
        }
        for (int l = 0; l < 9; l++) {
            if (num == arr[l][j]) {
                return false;
            }
        }

        for (int m = i-(i%3); m < i+(3-i%3); m++) {
            for (int n = j - (j % 3); n < j + (3 - j % 3); n++) {
                if(num == arr[m][n]){
                    return false;
                }
            }
        }
        return true;
    }
}
