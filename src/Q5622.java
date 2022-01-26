import java.util.Scanner;

public class Q5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        int result = 0;
        char[] arr = data.toCharArray();
        for(char c:arr) {
            if (c >= 'A' && c <= 'C') {
                result += 3;
            } else if (c >= 'D' && c <= 'F') {
                result += 4;
            } else if (c >= 'G' && c <= 'I') {
                result += 5;
            } else if (c >= 'J' && c <= 'L') {
                result += 6;
            } else if (c >= 'M' && c <= 'O') {
                result += 7;
            } else if (c >= 'P' && c <= 'S') {
                result += 8;
            } else if (c >= 'T' && c <= 'V') {
                result += 9;
            } else if (c >= 'W' && c <= 'Z') {
                result += 10;
            }
        }
        System.out.println(result);
    }
}
