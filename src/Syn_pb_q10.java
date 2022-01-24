import java.util.Random;

class OddException extends Exception {
}

public class Syn_pb_q10 {
    static void execute(int n) throws OddException {
        try {
            System.out.printf("입력 숫자: %d\n", n);
            if (n % 2 == 1) {  // 홀수이면 OddException이 발생한다.
                throw new OddException();
            }
            System.out.println("짝수입니다.");
        } catch (OddException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws OddException {
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            execute(r.nextInt(10));
        }
        System.out.println("10회 반복했습니다.");
    }
}