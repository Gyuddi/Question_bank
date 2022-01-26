import java.util.Scanner;

public class Q2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char [] ch_arr = str.toCharArray();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = ch_arr[i];
            if(i<str.length()-1){
                if(ch == 'c') {
                    if(ch_arr[i+1] == '=') {
                        i++;
                    }
                    else if(ch_arr[i+1] == '-') {
                        i++;
                    }
                }
                else if(ch == 'd') {
                    if(ch_arr[i+1] == '-'){
                        i++;
                    }
                    else if (ch_arr[i+1] == 'z') {
                        if (i < str.length() - 2) {
                            if (ch_arr[i+2] == '=') {
                                i += 2;
                            }
                        }
                    }
                }

                else if(ch == 'l') {
                    if(ch_arr[i+1] == 'j') {
                        i++;
                    }
                }
                else if(ch == 'n') {
                    if(ch_arr[i+1] == 'j') {
                        i++;
                    }
                }

                else if(ch == 's') {
                    if(ch_arr[i+1] == '=') {
                        i++;
                    }
                }

                else if(ch == 'z') {
                    if(ch_arr[i+1] == '=') {
                        i++;
                    }
                }
            }
            count+=1;
        }
        System.out.println(count);
    }
}
