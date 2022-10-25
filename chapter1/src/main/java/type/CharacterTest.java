package type;

public class CharacterTest {
    public static void main(String[] args) {
        char ch1 = 'A';

        System.out.println(ch1);
        System.out.println((int)ch1);   // int로 타입 변환을 해주면 정수값 출력

        char ch2 = 66;

        System.out.println(ch2);        // char 으로 선언했기 때문에 문자가 출력된다.
        System.out.println((char)ch2);

        int ch3 = 67;

        System.out.println(ch3);        // int로 선언했기 때문에 정수 값 출력.
        System.out.println((char)ch3);  // char으로 형변환을 해주자 문자 C가 출력된다.
    }
}
