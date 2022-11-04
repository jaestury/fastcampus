package repeat;

import java.util.Scanner;

public class DoWhileTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input;
        int sum = 0;

        do {
            input = sc.nextInt();
            sum += input;
        } while (input != 0);

        System.out.println(sum);
    }
}

// input 이 입력되면 일단 조건문을 수행하고, input 이 0 이 입력될 경우 반복문을 그만 수행한다.
// 값을 입력받고, 그 값 여하에 따라 조건문을 수행하고 싶을 때는 do-while 문을 사용하는 것이 좋을 수 있다.
// while 문으로 작성할 경우..

//        input=sc.nextInt();

//        while(input != 0){
//          sum += input;
//          input = sc.input;
//        }
//        System.out.println(sum);