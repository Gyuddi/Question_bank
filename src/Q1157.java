import java.util.*;
import java.util.Map.Entry;

public class Q1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str.toUpperCase();
        HashMap<String, Integer> map = new HashMap<>();
        String[] S_arr = str.split("");
        for(String a:S_arr){
            if(map.containsKey(a)){
                map.put(a,map.get(a)+1);
            }
            else {
                map.put(a,1);
            }
        }
        int max = 0;
        String max_key = new String();
        for(String s:map.keySet()){
            if(map.get(s)>max){
                max = map.get(s);
                max_key = s;
            }
        }
        map.remove(max_key);
        if(map.values().contains(max)){
            System.out.println("?");
        }
        else {
            System.out.println(max_key);
        }
    }
}
