import java.util.Scanner;

public class Q4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_len = sc.nextInt();
        for (int i = 0;i<test_len;i++){
            double sum = 0;
            int arr_len = sc.nextInt();
            int [] arr = new int[arr_len];
            for (int j = 0;j<arr_len;j++){
                int a = sc.nextInt();
                sum+=a;
                arr[j] = a;
            }
            double count = 0;
            double avg = sum/arr_len;
            for(int k = 0;k<arr_len;k++){
                if(arr[k]>avg){
                    count+=1;
                }
            }
            double result = count/arr_len;
            System.out.println(String.format("%.3f%%",result*100));
        }
    }
}
