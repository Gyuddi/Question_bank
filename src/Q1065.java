import java.util.Scanner;

public class Q1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a<100){
            System.out.println(a);
        }
        else {
            int count = 99;
            for (int i = 100; i <= a; i++) {
                int hun = i / 100;
                int ten = (i / 10) % 10;
                int one = i % 10;
                if ((hun - ten) == (ten - one)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}

