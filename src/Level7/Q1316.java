import java.util.ArrayList;
import java.util.Scanner;

public class Q1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String a = sc.nextLine();
        int count = 0;
        for(int i = 0;i<num;i++){
            String data = sc.nextLine();
            String [] data_arr =data.split("");
            ArrayList<String> pot = new ArrayList<>();
            boolean is_it  = true;
            for(int j = 0;j< data_arr.length;j++){
                if(pot.contains(data_arr[j])){
                    if(data_arr[j].equals(pot.get(pot.size()-1))){
                        continue;
                    }
                    else {
                        is_it = false;
                    }
                }
                else {
                    pot.add(data_arr[j]);
                }
            }
            if(is_it){
                count++;
            }
        }
        System.out.println(count);
    }
}
