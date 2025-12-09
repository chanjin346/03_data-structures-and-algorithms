package com.ohgiraffers.section04.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B1158 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(solution(n, k));
    }

    public static String solution(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();

        // 1부터 n만큼의 사람을 추가
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        // 결과 문자열 만들기용 가변 문자열 객체
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        // Queue에 사람이 남아 있다면 반복 == 모든 사람이 나가면 반복 종료
        while(!queue.isEmpty()){
            // K - 1번 반복하여 큐 앞에 사람을 뒤로 옮기기
            for(int i=0; i < k-1; i++) {
                queue.offer(queue.poll());
            }
            // K번째 사람을 꺼내고 StringBuilder에 추가
            sb.append(queue.poll());
            if (!queue.isEmpty()){
                sb.append(", ");
            }
        }

        sb.append(">");
        return sb.toString(); // "<3, 6, 2, 7, 5, 1, 4>"
    }

}
