package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CookingTest {
    @DisplayName("메뉴에 해당하는 음식을 만든다.")
    @Test
    void makeCookTest() {
        Cooking cooking = new Cooking();    // 요리사 객체 생성
        MenuItem menuItem = new MenuItem("돈까스", 5000);  // 새로운 MenuItem 생성.

        Cook cook = cooking.makeCook(menuItem);  // 요리 요청을 하며 메뉴 전달

        assertThat(cook).isEqualTo(new Cook("돈까스", 5000));

    }
}
