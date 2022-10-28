package type;

public class TypeConversionTest {
    public static void main(String[] args) {
        byte bNum = 125;
        int iNum = bNum;

        System.out.println(iNum);  // byte → int 형변환은 아무 문제가 없다.

//        int iNum2 = 255;
//        byte bNum2 = iNum2;        // int의 크기가 더 크고 byte는 255라는 숫자를 담을 수 없기 때문에 오류가 발생한다.


    }
}
