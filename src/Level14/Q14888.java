package Level14;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q14888 {
    static int N;
    static int[] number;
    static int[] operator = new int[4];
    static ArrayList<Integer> answer =new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        number = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            number[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 4; i++) {
            operator[i] = Integer.parseInt(st.nextToken());
        }
        dfs(number[0],0);
        answer.sort(Comparator.naturalOrder());
        System.out.println(answer.get(answer.size()-1));
        System.out.println(answer.get(0));
    }
    public static void dfs(int num,int count){
        if (count == N-1){
            answer.add(num);
            return;
        }
        for (int i = 0; i < 4; i++) {
            if (operator[i]>0){
                operator[i] --;
                switch (i) {
                    case 0:	dfs(num + number[count+1], count + 1);	break;
                    case 1:	dfs(num - number[count+1], count + 1);	break;
                    case 2:	dfs(num * number[count+1], count + 1);	break;
                    case 3:	dfs(num / number[count+1], count + 1);	break;
                }
                operator[i] ++;
            }
            
        }

    }
}
