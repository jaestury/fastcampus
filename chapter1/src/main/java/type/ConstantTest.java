package type;

public class ConstantTest {
    public static void main(String[] args) {
        final int MAX_NUM = 100;
        final int MIN_NUM;

        MIN_NUM = 0;       // 상수는 사용하기 전에 반드시 선언을 해주어야한다.

//        MAX_NUM = 200;   int 앞에 final을 넣어 상수로 지정해주기 전에 MAX_NUM은 변수이기 때문에 값 변경이 가능했지만, final을 넣어서 상수로 선언해주면 값 변경이 불가능하다.
        System.out.println(MAX_NUM);
        System.out.println(MIN_NUM);
    }
}
