package condition;

import java.util.Scanner;

public class IfElseIfTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        int charge;

        if (age < 8){
            charge = 1000;
            System.out.println("미취학 아동입니다.");
        }else if (age < 14){
            charge = 2000;
            System.out.println("초등학생입니다.");
        }else if (age < 20){
            charge = 2500;
            System.out.println("중, 고등학생입니다.");
        }else{
            charge = 3000;
            System.out.println("성인입니다.");
        }
        System.out.println("입장료는 "+ charge + "입니다.");
    }
}

// 나이가 12살일 때를 예시로 들어보자.
// if - else if 문을 사용한다면, 조건문에서 age < 14를 만족하기 때문에 charge는 2000원이고, "초등학생입니다."를 출력한 후 조건문을 종료한다.
// 하지만 if - if 문을 사용할 경우, age < 13을 만족하지만, 그 아래에 있는 age < 20 도 만족하기 때문에 age < 20을 출력하게된다.
// 각각의 조건을 따로따로 비교한다면, 일반적이지는 않지만, 그때는 if - if 를 사용할 수 있다.