package Level12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        Data[] d_arr = new Data[total];
        for (int i = 0; i < total; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            d_arr[i] = new Data(age,name);
        }
        Arrays.sort(d_arr,new Comparator<Data>() {
            @Override
            public int compare(Data d1, Data d2) {
                return d1.age- d2.age;
            }
        });
        for (int i = 0; i < total; i++) {
            System.out.println(d_arr[i].toString());
        }
    }
    public static class Data{
        int age;
        String name;
        Data(int age,String name){
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return age +" "+ name;
        }
    }
}
