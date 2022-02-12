package Level12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class Q1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        ArrayList<Integer> alist = new ArrayList<>();
        while (num>0){
            alist.add(num%10);
            num /= 10;
        }
        int answer = 0;
        int a = 1;
        alist.sort(Comparator.naturalOrder());
        for (int i = 0; i < alist.size(); i++) {
            answer+=alist.get(i)*a;
            a*=10;
        }
        System.out.println(answer);
    }
}
