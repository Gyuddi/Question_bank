import java.util.Scanner;

public class Q2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        for(int i = 0;i<total;i++){
            int repeat  = sc.nextInt();
            String S = sc.next();
            for(int k = 0;k<S.length();k++){
                for(int j = 0;j<repeat;j++){
                    System.out.print(S.charAt(k));
                }
            }
            System.out.println();
        }
    }
}
