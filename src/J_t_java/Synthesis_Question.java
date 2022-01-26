import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Stream;

//9.
//class p_Calculator{
//    int[] data;
//    p_Calculator(int[] data){
//        this.data = data;
//    }
//    public int sum(){
//        int result = 0;
//        for(int i:this.data){
//            result += i;
//        }
//        return result;
//    }
//    public double avg(){
//        int result = this.sum()/this.data.length;
//        return result;
//    }
//}

public class Synthesis_Question {
//    public static void main(String[] args) {
        //1.
//    }
//        String a = "a:b:c:d";
////        String b = a.replace(":","#");
////        System.out.println(b);
//        String b = String.join("#",a.split(":"));
//        System.out.println(b);
        //2.
//        int[] A = {20, 55, 67, 82, 45, 33, 90, 87, 100, 25};
//        int result = 0;
//        for(int num:A){
//            if(num >= 50){
//                result += num;
//            }
//        }
//        System.out.println(result);
//    }
//    }
    //3.
//    public static int fibo(int a){
//        int fibo1 = 0;
//        int fibo2 = 1;
//        int fibo3 = 0;
//        if(a < 3){
//            return a;
//        }
//        else {
//            for(int i = 2;i<a+1;i++){
//                fibo1 = fibo2 + fibo3;
//                fibo2 = fibo3;
//                fibo3 = fibo1;
//            }
//        }
//        return fibo1;
//    }
    //동적 프로그래밍 사용.
//    static int fibo(int a){
//        if(a == 0){
//            return 0;
//        }
//        else if(a == 1){
//            return 1;
//        }
//        else {
//            return fibo(a-1)+fibo(a-2);
//        }
//    }
    //재귀함수 사용.
//    public static void get_fibo(int n){
//        for(int i = 0;i<= n;i++){
//            System.out.println(fibo(i));
//        }
//    }
//    public static void GuGu() {
//        System.out.println("구구단을 출력할 숫자를 입력하세요(2~9):");
//        Scanner sc = new Scanner(System.in);
//        int b = sc.nextInt();
//        for (int i = 0;i<10;i++){
//            System.out.print(b*i+" ");
//        }
//    }
    //4.
//    public static int sum_Input(){
//        int result = 0;
//        System.out.println("숫자를 입력하시오.");
//        Scanner sc = new Scanner(System.in);
//        String a = sc.nextLine();
//        String[] b  = a.split(",");
//        for(int i =0;i<b.length;i++){
//            int c = Integer.parseInt(b[i]);
//            result+=c;
//        }
//        return result;
//    }
    //11.
//    static String dashInsert(String data){
//        int [] arr_data = Arrays.stream(data.split(""))
//                        .mapToInt(Integer::parseInt)
//                                .toArray();
//        ArrayList<String> alist = new ArrayList<>();
//        alist.add(Integer.toString(arr_data[0]));
//        System.out.println(alist);
//        for(int i = 1;i<arr_data.length;i++) {
//            alist.add(Integer.toString(arr_data[i]));
//            if (arr_data[i] % 2 == 1 && arr_data[i - 1] %2 == 1) {
//                alist.add("-");
//            }
//            if (arr_data[i] % 2 == 0 && arr_data[i - 1] %2 == 0) {
//                alist.add("*");
//            }
//        }
//        String answer = String.join("",alist);
//        return answer;
//    }
    //12.
//    public static ArrayList<String> comp_String(String str){
//        String[] str_arr = str.split("");
//        ArrayList<String> answer = new ArrayList<>();
//        ArrayList<String> str_answer = new ArrayList<>();
//        int count = 1;
//        for(String st:str_arr){
//            int len_answer = str_answer.size();
//            if(len_answer == 0){
//                str_answer.add(st);
//                answer.add(st);
//            }
//            else {
//                String a = str_answer.get(str_answer.size()-1);
//                if(st.equals(a)){
//                    count +=1;
//                }
//                else {
//                    answer.add(Integer.toString(count));
//                    answer.add(st);
//                    str_answer.add(st);
//                    count = 1;
//                }
//            }
//        }
//        answer.add(Integer.toString(count));
//        return answer;
//    }


    //13.
//    public static boolean chkDupNum(String data){
//        ArrayList<String> strlist = new ArrayList<>();
//        for(String a:data.split("")){
//            if(strlist.contains(a)){
//                strlist.add(a);
//                return false;
//            }
//            else {
//                strlist.add(a);
//            }
//        }
//        return strlist.size() == 10;
//    }
    //14.
//    public static String morse(String data){
//        HashMap<String, String> map = new HashMap<>();
//        map.put(".-", "A");
//        map.put("-...", "B");
//        map.put("-.-.", "C");
//        map.put("-..", "D");
//        map. put(".", "E");
//        map.put("..-.", "F");
//        map. put("--.", "G");
//        map. put("....", "H");
//        map.put("..", "I");
//        map.put(".---", "J");
//        map.put("-.-", "K");
//        map.put(".-..", "L");
//        map.put("--", "M");
//        map.put("-.", "N");
//        map.put("---", "O");
//        map.put(".--.", "P");
//        map.put("--.-", "Q");
//        map.put(".-.", "R");
//        map.put("...", "S");
//        map.put("-", "T");
//        map.put("..-", "U");
//        map.put("...-", "V");
//        map.put(".--", "W");
//        map.put("-..-", "X");
//        map.put("-.--", "Y");
//        map.put("--..", "Z");
//        ArrayList<String> result = new ArrayList<>();
//        for(String word:data.split("  ")){
//            for (String char_w:word.split(" ")){
//                result.add(map.get(char_w));
//            }
//            result.add(" ");
//        }
//        return String.join("",result);
//    }
    //15.
    public static String Caesar(String data,int num){
        char[] data_arr = data.toCharArray();
        ArrayList<String> result = new ArrayList<>();
        for(char ch:data_arr){
            int ch_num = (int)ch;
            System.out.println(ch_num);
            if(ch_num>90){
                int new_charnum = ch_num-26;
                result.add(String.valueOf((char)new_charnum));
            }
            else {
                int new_charnum = ch_num+5;
                System.out.println((char)new_charnum);
                result.add(String.valueOf((char)new_charnum));
            }
        }
        return String.join("",result);
    }

    public static void main(String[] args) {
        System.out.println(Caesar("CAT", 5));
    }
}
