import java.util.Scanner;

public class Q10809 {
    public static void main(String[] args) {
        int[] arr = new int[26];
        for(int i = 0;i<arr.length;i++){
            arr[i] = -1;
        }
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for(int i = 0; i<str.length();i++){
            char chr = str.charAt(i);
            if(arr[chr - 97] == -1){
                arr[chr - 97] = i;
            }
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
