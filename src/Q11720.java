import java.util.Scanner;

public class Q11720 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.next();
        String[] c = b.split("");
        for (String i:c){
            int d = Integer.parseInt(i);
            sum += d;
        }
        System.out.println(sum);
    }
}
