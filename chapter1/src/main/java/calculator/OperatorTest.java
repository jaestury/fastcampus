package calculator;

public class OperatorTest {
    public static void main(String[] args) {
        int gameScore = 150;

//        int lastScore = ++gameScore; // gameScore += 1;  gameScore = gameScore +1; 앞에 ++이 붙어있기 때문에 문장이 끝나기 전에 1을 증가시킨다. lastScore, gameScore 모두 151
        int lastScore = gameScore++; // gameScore += 1;  gameScore = gameScore +1; 앞에 ++이 붙어있기 때문에 문장이 끝나기 전에 1을 증가시킨다. lastScore은 150, gameScore은 151
        // -- 의 경우도 마찬가지.

        System.out.println(lastScore);
        System.out.println(gameScore);
    }
}
