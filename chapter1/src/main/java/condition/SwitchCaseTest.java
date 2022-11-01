package condition;

import java.util.Scanner;

public class SwitchCaseTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        int day;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = 31;
                break;
            case 2: day = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day = 30;
                break;
            default:
                System.out.println("존재하지 않는 달입니다.");
                day = -1;
        }
        System.out.println(month + "월은 " + day + "일 입니다.");
    }
}

// case 문에서는 중괄호를 사용하지 않는다.
// break 를 사용하지 않으면 맞는 케이스를 만나도, 그 케이스에서 끝나지 않고 다음 케이스도 수행하게 되버린다.
