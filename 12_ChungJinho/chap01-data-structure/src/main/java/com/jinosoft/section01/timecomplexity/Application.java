package com.jinosoft.section01.timecomplexity;

import java.util.Arrays;

/* ** 시간복잡도를 이해할 수 있다 **
*  시간 복잡도란?
*  - 알고리즘(로직) 해결하는데 걸리는 시간의 양을 나타내는 척도
*  - 입력 크기(n)에 대한 함수로 표현
*  - Big-O 표기법을 사용하여 최악의 경우를 나타냄
*  - 특정 알고리즘이 대규모 데이터셋에서 얼마나 잘 동작할지 예측하는데 중요
*  */
public class Application {
  public static void main(String[] args) {
    int[] arr = {3,1,2,15,4,9,10,7};
    System.out.println("arr : " + Arrays.toString(arr));


    System.out.println("상수 시간 O(1) 결과 : " + getFirst(arr));
    System.out.println("선형 시간 0(n) 결과 : " + Arrays.toString(reverse(arr)));
    System.out.println("선형 시간 0(log n) 결과(index) : " + binarySearch(arr, 15));

    System.out.println("지수 시간 0(2^n) 피보나치 결과 : " + fibonacci(51));
    System.out.println("선형 시간 0(n) 피보나치 결과 : " + fibonacci2(51));
    System.out.println("상수 시간 O(1) 피보나치 결과 : " + fibonacci3(51));
  }

  /* 상수 시간 O(!)
  *  - 입력된 크기와 관련없이 코드 실행 시간이 일정한 경우를 의미 */
  private static int getFirst(int[] arr){
    // 입력된 배열의 크기가 아무리 커지더라도 연산은 딱 1번(덧셈)만 수행됨
    // 입력 크기가 실행 시간에 영향을 주지 않는다.
    return arr[0] + arr[1];
  }

  /* 선형 시간 O(n)
   *  - 입력 크기(n)에 비례해 실행 시간이 증가한다.
   *  - 예시) 리스트|배열 순회
   *  - 이점 : 입력 크기에 따라 예측 가능한 성능을 제공한다.
   */
  private static int[] reverse(int[] arr) {

    int[] rArr = new int[arr.length];

    for (int i = 0; i < arr.length; i++) {
      rArr[i] = arr[arr.length - (i+1)];
    }
    return rArr;

  }

  /* 로그 시간 O(log n)
   *  - 입력 크기(n)가 증가할 때 실행 시간이 로그 함수적으로 증가
   *  - 탐색 공간을 절반씩 줄이는 알고리즘에서 나타남
   */
  private static int binarySearch(int[] arr, int target) {

    int[] sorted = Arrays.copyOf(arr, arr.length); // 복사
    Arrays.sort(sorted); // 복사본 배열 정렬

    int left = 0;
    int right = sorted.length - 1;

    while (left <= right) {

      int mid = left + (right - left) / 2;

      if (sorted[mid] == target) { // 잡았다 요놈

        for (int i = 0; i < arr.length; i++) {
          if (arr[i] == target) { // 원본에서 target이 가지고 있는
            return i; // target의 인덱스
          }
        }

        return -1;  // 원본 배열에서 못 찾을 경우
      }

      if (sorted[mid] > target) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }

    return -1;
  }

  /* 지수 시간 O(2^n)
  *  - 입력 크기 n이 증가할 때마다 2^n에 비례하여 시간이 기하급수적으로 상승하는 경우
  *  -  */
  // 방법 1 제일 느림
  private static long fibonacci(int n) {
    if (n <= 1)
      return n;
    else
      return fibonacci(n - 1) + fibonacci(n - 2);
  }

  // 방법2 // 빠름
  private static long fibonacci2(int n) {
    if(n <= 1)
      return n;
    else{
      long[] fib = new long[n+1];
      fib[0] = 0;
      fib[1] = 1;
      for (int i = 2; i <= n; i++) {
        fib[i] = fib[i-1] + fib[i-2];
      }
      return fib[n];
    }
  }

  // 방법3 // 개빠름
  private static long fibonacci3(int n) {
    if(n <= 1)
      return n;
    else{
      double x = (1 + Math.sqrt(5.0))/2;
      double y = (1 - Math.sqrt(5.0))/2;
      double z = (Math.pow(x, (double)n) - Math.pow(y, (double)n))
          / Math.sqrt(5.0);
      return Math.round(z);
    }
  }








}
