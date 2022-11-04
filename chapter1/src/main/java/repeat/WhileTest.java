package repeat;

public class WhileTest {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;

        while (num <= 10){
            sum += num;  // 지역변수는 초기화를 해주어야 한다.
            num++;
        }
        System.out.println(sum);
        System.out.println(num);
    }
}
// sum 은 55, num 은 11 출력. 1~10을 더한것은 55이고, while 문을 빠져나간 num 의 값은 11이 된다.