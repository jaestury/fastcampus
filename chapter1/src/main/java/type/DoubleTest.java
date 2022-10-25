package type;

public class DoubleTest {
    public static void main(String[] args) {
        double dnum = 3.14;
        float fnum  = 3.14f;    // 실수는 double이 기본 타입. 하지만, double 이 float 보다 큰 타입이기 때문에 실수를 float 로 선언할 때는 형변환을 해줄 식별자 `f` `F`가 필요하다.

        System.out.println(dnum);
        System.out.println(fnum);
    }
}
