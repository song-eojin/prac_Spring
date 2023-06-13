package com.sparta.springprepare.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

//Junit 은 테스트 실행 환경을 따로 가지고 있어서 main 메서드나 서버를 따로 실행시키지 않아도 테스트 코드를 실행할 수 있다.
class CalculatorTest {
    //엣지별(각각의 상황. 여기서는 더하기, 빼기 , 곱하기, 나누기, 오류발생하는 케이스)로 테스트

    @Test
    @DisplayName("더하기 테스트")
    void test1() {
        Calculator calculator = new Calculator();
        Double result = calculator.operate(8, "+", 2);
        System.out.println("addResult = " + result);

        Assertions.assertEquals(10, result);
    }

    @Test
    @DisplayName("나누기 테스트")
    void test2() {
        Calculator calculator = new Calculator();
        Double result = calculator.operate(8, "/", 2);
        System.out.println("divideResult = " + result);

        Assertions.assertEquals(4, result);
    }
}