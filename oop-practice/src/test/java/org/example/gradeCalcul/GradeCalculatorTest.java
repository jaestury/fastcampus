package org.example.gradeCalcul;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 요구사항
 * 평균학점 계산 방법 = (학점수 * 교과목 평점)의 합계 / 수강신청 총학점 수
 * 일급 컬렉션 사용
 */

public class GradeCalculatorTest {
    // 학점 계산기 도메인 : 이수한 과목(객체지향 프로그래밍, 자료구조, 중국어 회화), 학점 계산기
    // 학점 계산기는 이수한 과목을 갖고 학점을 계산하지 않을까? → 학점 계산기가 이수한 과목을 인스턴스 변수로 갖으면서 평균학점을 계산할 수 있어야겠다.
    // 이수한 과목 예 : 객체지향 프로그래밍, 자료구조, 중국어 회화 → 과목(코스) 클래스
    // 객체들을 먼저 생각해보고 이러한 객체들을 나열한 다음 이들을 정적인 타입인 클래스로 추상화한다.
    /**
     * 핵심 포인트
     */
    // 이수한 과목을 전달하여 평균학점 계산 요청 ----> 학점 계산기 ---> (학점수 * 교과목 평점)의 합계 ---> 과목(코스) 일급 콜렉션
    //                                                    --->   수강신청 총학점 수         ---> 과목(코스) 일급 콜렉션
    // 학점 계산기가 직접 (학점수 * 교과목 평점)의 합계와 수강신청 총학점 수를 구해 나눌수도 있지만, 과목(코스) 작업을 요청할 수 있다.
    // 과목(코스)는 이수한 과목에 대한 정보와 총학점 수의 정보를 모두 갖고 있기 때문.


    @DisplayName("평균 학점을 계산한다.")
    @Test
    void calculateGradeTest() {
        List<Course> courses = List.of(
                new Course("OOP", 3, "A+"),
                new Course("자료구조", 3, "A+"));

        GradeCalculator gradeCalculator = new GradeCalculator(courses);
        double gradeResult = gradeCalculator.calculateGrade();

        assertThat(gradeResult).isEqualTo(4.5);
    }
}
