package type;

public class TypeConversionTest {
    public static void main(String[] args) {
        byte bNum = 125;
        int iNum = bNum;

        System.out.println(iNum);  // byte → int 형변환은 아무 문제가 없다.

//        int iNum2 = 255;
//        byte bNum2 = iNum2;        // int의 크기가 더 크고 byte는 255라는 숫자를 담을 수 없기 때문에 오류가 발생한다.

        int iNum2 = 255;
        byte bNum2 = (byte)iNum2;

        System.out.println(bNum2);  // -1이 출력된다. byte 는 255의 값을 담을 수 없음에도 프로그래머가 타입 전환을 통해 강제 캐스팅해줬고, 결과 자료에 문제가 생길 수 있다.

        double dNum = 3.14;
        int iNum3 = (int)dNum;      // 타입 변환을 통해 double 을 int에 담아줄 수 있지만,
        System.out.println(dNum);   // `3`만 출력이 된다. 자료 유실을 감수하고 이렇게 사용할 이유는 없지만, 그럼에도 이렇게 사용할 수도 있기는 하다.
    }
}
