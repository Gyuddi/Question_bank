import java.util.Scanner;

public class Q2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        StringBuffer sb1 = new StringBuffer(a);
        StringBuffer sb2 = new StringBuffer(b);
        int i_a = Integer.parseInt(sb1.reverse().toString());
        int i_b = Integer.parseInt(sb2.reverse().toString());
        if(i_a>i_b){
            System.out.println(i_a);
        }
        else {
            System.out.println(i_b);
        }
    }
}
