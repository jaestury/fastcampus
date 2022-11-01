package Calculator;

public class mixCal {
    public static void main(String[] args) {
        int myNum = 10;
        int yourNum = 20;

//        myNum = myNum+yourNum;     // myNum 에 myNum+yourNum 한 값 대입. A = A + B
//        System.out.println(myNum);

        myNum += yourNum;     //  myNum 에 myNum+yourNum 한 값 대입. 동일한 의미이지만, 더 간략하게 표현할 수 있음.  `A + B 한 값`을 A에 대입하는 느낌으로 사용하면 좋다.
        System.out.println(myNum);
    }
}
