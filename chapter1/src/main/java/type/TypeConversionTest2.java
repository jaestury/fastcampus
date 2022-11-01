package type;

public class TypeConversionTest2 {
    public static void main(String[] args) {
        double dNum = 1.2;
        float fNum = 0.9f;

        int iNum1 = (int)dNum + (int)fNum;
        int iNum2 = (int)(dNum + fNum);

        System.out.println(iNum1);  // double, float 를 int 로 형변환 했기 때문에, 각각 1, 0이 되고 이 둘을 더했기 때문에 1이 결과가 된다.
        System.out.println(iNum2);  // 먼저 더하고 이후 int 로 형변환 했기 때문에, (1.2+0.9) 를 해서 2가 되고, 인트로 변환된다.

    }
}
