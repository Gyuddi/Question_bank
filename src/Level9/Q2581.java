package Level9;

import java.util.ArrayList;
import java.util.Scanner;

public class Q2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        boolean[] Prime = new boolean[max+1];
        Prime[0]=Prime[1] = true;
        for(int i = 2;i<Math.sqrt(max);i++){
            if(Prime[i]){
                continue;
            }
            for(int j=i*i;j<=max;j+=i){
                Prime[j] = true;
            }
        }
        ArrayList<Integer> alist = new ArrayList<>();
        for(int a = min;a<=max;a++){
            if (Prime[a] == false) {
                alist.add(a);
            }
        }
        if(alist.size() == 0){
            System.out.println(-1);
        }
        else {
            System.out.println(alist.stream().mapToInt(Integer::intValue).sum());
            System.out.println(alist.get(0));
        }
    }
}
