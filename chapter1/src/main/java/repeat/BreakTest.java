package repeat;

public class BreakTest {
    public static void main(String[] args) {
        int sum = 0;
        int num;

        for (num = 1; ; num++){

            sum += num;
            if (sum >= 100)
                break;          // sum 이 100보다 크거나 같으면 반복문 정지. break 를 사용하지 않으면 num 에 한 번 더 더하게 된다. sum 이 100을 넘는 순간은 num 이 14가 되는 순간.
        }
        System.out.println(sum);
        System.out.println(num);
    }

}
