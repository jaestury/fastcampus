package type;

public class BinaryTest {
    public static void main(String[] args) {
        int num = 10;
        int bNum = 0B1010;  // B는 2진수
        int oNum = 012;     // 앞에 0이 들어가면 8진수
        int xNum = 0XA;     // 0X가 가 들어가면 16진수

        System.out.println(num);
        System.out.println(bNum);
        System.out.println(oNum);
        System.out.println(xNum);
    }
}
