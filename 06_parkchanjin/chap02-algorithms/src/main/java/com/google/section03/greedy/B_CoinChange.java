package com.google.section03.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.StringTokenizer;

/*  동전 교환 문제
 *  주어진 N개의 동전을 이용하여
 *  금액 K를 만들기 위한
 *  동전의 최소 개수 구하기
 *
 * ex) N = 3 (10, 50, 100), K = 670
 *     결과 -> 9 (10*2, 50*1, 100*6)
 */
public class B_CoinChange {

  public static int solution(String input) throws IOException{
    int count = 0;
    BufferedReader br = new BufferedReader(new StringReader(input));
    /* br
    "10 4200" +
        "1\n" +
        "5\n" +
        "10\n" +
        "50\n" +
        "100\n" +
        "500\n" +
        "1000\n" +
        "5000\n" +
        "10000\n" +
        "50000"
    */

    StringTokenizer st = new StringTokenizer(br.readLine()); // "10" "4200"
    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());

    // 읽어온 동전의 종류를 배열에 저장
    int[] A = new int[N];
    for(int i = 0; i < N; i++){
       A[i] = Integer.parseInt(br.readLine());
    }

    /*
    while(!(K==0)) {
      if (K >= 50000) K -= 50000;

      else if (K >= 10000) K -= 10000;

      else if (K >= 5000) K -= 5000;

      else if (K >= 1000) K -= 1000;

      else if (K >= 500) K -= 500;

      else if (K >= 100) K -= 100;

      else if (K >= 50) K -= 50;

      else if (K >= 10) K -= 10;

      else if (K >= 1) K -= 1;

      count ++;

      }*/

    /* 그리디 알고리즘 : 큰 동전부터 사용해서 최적해 구하기*/
    // coins[] 배열에 저장된 동전의 종류는 0 ~ 끝 오름차순
    // == 끝 인덱스로 갈 수록 동전 금액이 크다
    for (int i = N-1; i>= 0; i --) {
      if(K < A[i]) continue;

      count = K / A[9]; // 동전 사용 개수 누적
      K %= A[9]; // 나눴을 때 나머지는 K에 대입

      if(K == 0) break; // 동전 교환 끝!
    }



    return count;
  }

}
