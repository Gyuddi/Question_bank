import java.util.Scanner;

public class Q1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        int count = 0;
        String[] data_arr = data.split("");
        for(int i = 0;i< data_arr.length;i++){
            if(data_arr[i].equals(" ")){
                count+=1;
            }
        }
        if(data_arr[0].equals(" ")){
            count-=1;
        }
        if(data_arr[data_arr.length-1].equals(" ")){
            count-=1;
        }
        System.out.println(count+1);
    }
}
