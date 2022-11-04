package repeat;

public class ForTest {
    public static void main(String[] args) {
        int count = 1;
        int sum = 0;

        // for 문을 사용한 경우
        for (int i = 0; i < 10; i++, count++) {  // 횟수를 체크하는 변수(i)를 따로 둠. 0부터 시작해서 해당되는 숫자보다 작은 조건을 다는 경우가 많다.

            sum += count;
        }

        System.out.println(sum);

        // while 문을 사용한 경우
        int num = 1;
        int total = 0;

        while (num <= 10) {
            total += num;
            num++;
        }
        System.out.println(total);
    }
}

// 횟수에 대해서 작업을 수행할 때는 for 문을 가장 많이 사용한다. 한 괄호 안에 들어갈 수 있기 때문에