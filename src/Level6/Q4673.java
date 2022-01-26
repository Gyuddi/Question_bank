public class Q4673 {
    public static int get_sn(int a){
        int result = a;
        while (a > 0){
            int rest = a % 10;
            a = a/10;
            result += rest;
        }
        return result;
    }
    public static void main(String[] args) {
        boolean[] pool = new boolean[10000];
        for(int i = 0;i<10000;i++){
            int number = get_sn(i);
            if (number >= 10000){
                continue;
            }
            pool[number] = true;
        }
        for(int i = 0;i<10000;i++){
            if(pool[i] == false){
                System.out.println(i);
            }
        }
    }

}
