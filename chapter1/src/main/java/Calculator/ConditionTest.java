package Calculator;

import java.util.Scanner;  // import 는 scanner가 java.util 라이브러리 안에 들어있다는 것을 알려준다.

public class ConditionTest {
    public static void main(String[] args) {
        int max;
        System.out.println("두 수를 입력받아서 더 큰 수를 출력하세요.\n");


        Scanner scanner = new Scanner(System.in);   // System.in 은 입력. 콘솔 화면에서 입력 받게끔 한다. Scanner 는 자바에서 제공해주며, java.util 이라는 패키지 안에 들어있다.
        //        System.out.println(num);   // 콘솔에 숫자를 입력해주면 실행이 종료되며, 콘솔에 입력해준 숫자를 출력한다.
        System.out.println("입력 1");
        int num1 = scanner.nextInt();
        System.out.println("입력 2");
        int num2 = scanner.nextInt();

        max = (num1 > num2)? num1 : num2;   // max 의 값에 `num1 > num2` 조건을 준다. num1 이 num2 보다 큰 것이 참이라면 num1을 max 에 대입하고 그렇지 않다면 num2를 max 에 대입한다.
        // 조건이 true 라면 앞의 값을, false 라면 뒤의 값을 선택해 사용하는 것이 조건연산자.
        System.out.println(max);


    }
}
