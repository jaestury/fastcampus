package type;

public class LocalVariableInter {
    public static void main(String[] args) {

        var i = 10;
        var j = 10.0;
        var str = "test";

        System.out.println(i);
        System.out.println(j);
        System.out.println(str);

        var str2 = str;   // 특정 값이 아닌 변수를 넣었지만, 위에 str이 String으로 선언되었기 때문에, 당연히 String으로 인식한 모습.
        System.out.println(str2);

        str = "hello";
//        str = 3;      // 변수 값은 변할 수 있기 때문에 자료를 변환시키는 것이나 같은 문자열인 "hello"로 변환될 수 있지만, int인 3으로는 변환될 수 없다.
        System.out.println(str);
    }
}
