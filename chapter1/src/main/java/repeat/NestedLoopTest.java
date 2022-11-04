package repeat;

public class NestedLoopTest {
    public static void main(String[] args) {

        int dan = 2;
        int count = 1;
// for 문을 사용한 경우
        for ( ; dan <= 9; dan++){

            for(count = 1; count <= 9; count++){

                System.out.println(dan + " X " + count + " = " + dan*count);
            }
            System.out.println();    // 단 하나 출력하고 한 줄 띄우기.
        }

// while 문을 사용한 경우
        dan = 2;
        count = 1;
        while (dan <= 9) {
            count = 1;           // for 문에서는 초기화문이 조건식 안에 있기 때문에 크게 신경쓸 필요 없지만, while 문에서는 신경 써주어야한다.
            while (count <= 9) {
                System.out.println(dan + " X " + count + " = " + dan * count);
                count++;
            }
            dan++;
            System.out.println();
        }
    }
}
