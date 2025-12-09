package com.ohgiraffers.section01.timecomplexity;

import java.util.Arrays;

public class Application {

    /* 시간 복잡도란?
     *   - 알고리즘(로직) 해결하는데 걸리는 시간의 양을 나타내는 척도
     *   - 입력 크기(n)에 대한 함수로 표현
     *   - Big-O 표기법을 사용하여 최악의 경우를 나타냄
     *   - 특정 알고리즘이 대규모 데이터 셋에서 얼마나 잘 동작할지 예측하는게 중요함
     * */
    public static void main(String[] args) {
        // 테스트용 정수 배열 선언 및 초기화
        int[] arr = {3,1,2,15,5,6,3,4,2,34,6,2,5,5,2,45,52,3,423,4634,6,234,23,4,};
        System.out.println("getFirst(arr) = " + getFirst(arr));

        arr = reverse(arr); // arr == result
        System.out.println("reverse(arr) = " + Arrays.toString(arr));

        System.out.println("hello world");
    }

    /* 상수 시간 BigO(1)
     *   - 입력된 크기와 관련 없이 코드 실행 시간이 일정한 경우를 의미합니다
     * */
    private static int getFirst(int[] arr) {
        // 입력된 배열의 크기가 아무리 커지더라도 연산은 딱 한 번만 수행됨
        // == 입력 크기가 실행 시간에 영향을 주지 않는다
        return arr[0] + arr[1];
    }

    /* 선형 시간 BigO(n)
     *   - 입력 크기(n)에 비례하여 실행 시간이 증가하는 경우를 의미
     *   - 흔한 예시 : 배열 / 리스트 순회
     * */
    private static int[] reverse(int[] arr) {
        int[] result = new int[arr.length];

        // reverse 로직
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - i - 1];
        }

        return result;
    }

    /* 로그 시간 O(log n)
    *   - 입력 크기(n)가 증가할 때, 실행 시간이 로그 함수적으로 증가하는 경우를 의미
    *   - 주로 탐색 공간을 절반씩 줄여 나가며 탐색하는 알고리즘에서 나타남
    *   - 이점: 입력이 커져도 효율적인 성능을 유지함
    *
    * */
    private static int binarySearch(int[] arr, int target) {
        /* 초기 세팅
        *   - 배열의 요소가 오름차순 정렬이 되어있어야 한다.
        * */

        // 배열 원본 정렬, Arrays.sort()는 O(n log n)의 시간복잡도를 갖는다.
        // 정렬시간 제외
        Arrays.sort(arr);

        // 탐색 시작(left), 끝(right) 인덱스를 가리키는 포인터
        int left = 0;
        int right = arr.length - 1;

        while(left <= right) {
            int mid = left + (right - left)/2;

            if (arr[mid] == target) { // 1. 찾으려는 target이 mid과 같다면
                return mid;
            }if (arr[mid] < target) { // 2. 찾으려는 target이 중간보다 크다면 (mid 보다 오른쪽에 있을 경우)
                left = mid + 1;
            }else if (arr[mid] > target){ // 3. 찾으려는 target이 중간보다 작다면 (mid보다 왼쪽에 있을 경우)
                right = mid - 1;
            }
        }
        return -1;
    }

    /* 지수 시간 O(2^n)
    *   - 입력 크기(n)이 증가할 때 마다 2의 n제곱에 비례하여
    *     시간이 기하급수적으로 증가하는 경우를 의미
    * */

    // fibonacci 수열에서 n번째 숫자 반환하기
    private static int fibonacci(int n) {
        // 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181....
        if (n <= 1) {
            return n;
        }else {
            // 재귀 함수: 함수가 다시 자신을 호출하는 함수
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }




}
