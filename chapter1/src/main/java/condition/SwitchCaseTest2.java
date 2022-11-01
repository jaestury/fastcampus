package condition;

import java.util.Scanner;

public class SwitchCaseTest2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        int day = switch (month) {  // switch 문도 반환값을 받을 수 있다.
            case 1, 3, 5, 7, 8, 10, 12 -> {
                System.out.println("이 달은 31일까지 있습니다.");
                yield 31;
            }
            case 2 -> {
                System.out.println("이 달은 28일까지 있습니다.");
                yield 28;
            }
            case 4, 6, 9, 11 ->{
                    System.out.println("이 달은 30일까지 있습니다.");
                    yield 30;
            }
            default -> {
                System.out.println("존재하지 않는 달입니다.");
                yield -1;  // 수행과 반환을 동시에 할 수는 없다. 따라서 반환값에는 yield 키워드를 사용해준다.
            }
        };
        System.out.println(month + "월은 " + day + "일 입니다.");
    }
}
