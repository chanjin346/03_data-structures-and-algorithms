package com.google.section04.dp;

/* 2 X N 직사각형을
* 2 X 1, 1 X 2 짜리 타일로 채우는 방법의 수 구하기
* == 피보나치 수열
* */
public class C_Tiling {

  public static int solution(int n) {

    /* DP : Bottom-up 방식 활용 */
    int[] dp = new int[n + 1];

    dp[0] = 0; // 2 X 0 을 채우는 방법 -> 0 가지
    dp[1] = 1; // 2 X 1 을 채우는 방법 -> 1 가지

    for(int i = 2; i <= n; i++) {
      dp[i] = dp[i - 1] + dp[i - 2];
    }

    return dp[n];
  }
}
