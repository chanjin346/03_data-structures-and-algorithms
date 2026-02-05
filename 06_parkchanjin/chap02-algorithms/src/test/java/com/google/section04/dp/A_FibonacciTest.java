package com.google.section04.dp;

import com.google.section04.dp.A_Fibonacci;
import com.google.section03.greedy.G_PrimAlgorithm;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class A_FibonacciTest {

  public static Stream<Arguments> provideSource() {
    return Stream.of(
        arguments(10, 55),
        arguments(40, 102334155)
    );
  }

  @DisplayName("기본 재귀 피보나치")
  @ParameterizedTest
  @MethodSource("provideSource")
  public void fibonacciTest1(int input, int output) {
    int result = A_Fibonacci.fibonacciIter(input);
    Assertions.assertEquals(output, result);
  }

  @DisplayName("DP-Top Down 피보나치")
  @ParameterizedTest
  @MethodSource("provideSource")
  public void fibonacciTest2(int input, int output) {
    //int result = A_Fibonacci.getFibonacciNumberDP(input);
    //Assertions.assertEquals(output, result);
  }

  @DisplayName("DP-Bottom Up 피보나치")
  @ParameterizedTest
  @MethodSource("provideSource")
  public void fibonacciTest3(int input, int output) {
    //int result = A_Fibonacci.getFibonacciNumberIter(input);
    //Assertions.assertEquals(output, result);
  }

  /* [DP : Bottom Up 방식]
  *  - 작은 문제부터 시작해서 큰 문제로 확장(반복문 사용)
  *  - 모든 부분을 순차적으로 계산
  *  - 재귀 호출 X -> Stack Overflow 위험이 없음
  *  - 일반적으로 Top-Down 방식보다 약간 더 빠름
  *
  *  - Tabulation(타뷸레이션)
  *   - 작은 문제(부분 문제)로 나눈 후 연산 결과를 테이블(배열)에 저장하는 방식
  * */
  public int fibonacciIter(int n) {
    int[] arr = new int[n + 1];
    arr[0] = 0;
    arr[1] = 1;

    if (n == 0) return arr[0];
    else if (n == 1) return arr[1];

    else {
      for (int i = 2; i < n + 1; i++) arr[i] = arr[i - 1] + arr[i - 2];
      return arr[n];
    }
  }
}