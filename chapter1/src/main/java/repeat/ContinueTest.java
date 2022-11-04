package repeat;

public class ContinueTest {
    public static void main(String[] args) {
        // 3의 배수를 가려내는 반복문.
        int num;

        for (num = 1; num <= 100; num++){

            if ((num % 3) != 0) continue;   // 만약(num 을 3으로 나눈 나머지가 0이 아닌 경우) continue 사용.
            System.out.println(num);        // continue 가 사용되면 왼쪽의 문장은 무시되고, 다시 if 문을 실행하게 된다.
        }
    }
}
// 가독성을 높이기 위해 괄호를 사용하자.