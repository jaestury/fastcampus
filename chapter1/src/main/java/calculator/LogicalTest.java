package calculator;

public class LogicalTest {
    public static void main(String[] args) {
        int num1 = 10;
        int i = 2;

        //boolean value = ((num1 = num1 + 10) < 10) && ((i = i+2) <10);
        //System.out.println(value);   // false
        System.out.println(num1);    // 20
        System.out.println(i);       // 2
        // num1 은 증가했지만, i는 증가하지 않았다. +2를 했는데도! 앞 항이 이미 false 이기 때문에 결과는 이미 false. 뒤 항을 계산하지 않았다.

        boolean value2 = ((num1 = num1 + 10) < 10) || ((i = i+2) <10);
        System.out.println(value2);  // true
        System.out.println(num1);    // 20
        System.out.println(i);       // 4
        // 이번에는 앞 항이 false 이기 때문에 뒤 항을 계산할 필요가 있었고, i에 +2를 실행, i의 값은 4가 되었다.
        // 앞 항이 true 가 되게 식을 짤 경우 > ((num1 = num1 + 10) < 10) 앞 항에서 이미 true 가 나왔기 때문에 뒤 항을 계산할 필요가 없게 되고 i는 여전히 2이게 된다.
    }
}
