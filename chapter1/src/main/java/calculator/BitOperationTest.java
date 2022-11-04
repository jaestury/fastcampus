package calculator;

public class BitOperationTest {
    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 10;

        System.out.println(num1|num2);
        System.out.println(num1&num2);
        System.out.println(num1^num2);
        System.out.println(~num1);

        System.out.println(num1 << 2);
        System.out.println(num1 <<= 2);  // num 값이 변하길 원한다면 대입 연산자를 사용해주어야한다.
        System.out.println(num1);

    }
}
