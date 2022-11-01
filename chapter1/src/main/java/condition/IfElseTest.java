package condition;

public class IfElseTest {
    public static void main(String[] args) {

        int age = 7;

        if(age >= 8){
            System.out.println("학교에 다닙니다.");
        }else {
            System.out.println("학교에 다니지 않습니다.");
        }
        System.out.println("노는게 젤 좋아.");
    }
}
// 들여쓰기를 해주도록 하자! 가독성이 좋아짐.
// 블럭 {}을 사용하는 습관을 들이자. 문장이 하나라면 안해도 되지만, 하는 것이 가독성이 훨씬 높아진다.