package com.ohgiraffers.section04.queue;


import java.util.LinkedList;
import java.util.Queue;

/* Queue
 *   - 선입선출(First In First Out) 원칙을 따르는 선형 자료구조
 * 주요 연산:
 * - offer(E e): 큐의 뒤에 요소를 추가합니다. (성공 시 true, 용량 초과 시 false 반환)
 * - add(E e): 큐의 뒤에 요소를 추가합니다. (용량 초과 시 IllegalStateException 발생)
 * - poll(): 큐의 앞에 있는 요소를 제거하고 반환합니다. (큐가 비어있으면 null 반환)
 * - remove(): 큐의 앞에 있는 요소를 제거하고 반환합니다. (큐가 비어있으면 NoSuchElementException 발생)
 * - peek(): 큐의 앞에 있는 요소를 제거하지 않고 반환합니다. (큐가 비어있으면 null 반환)
 * - element(): 큐의 앞에 있는 요소를 제거하지 않고 반환합니다. (큐가 비어있으면 NoSuchElementException 발생)
 * */
public class Application {

    public static void main(String[] args) {

        /* Collection 프레임워크에는 Queue 인터페이스를 구현한 여러 클래스가 존재함.
        *  그 중 LinkedList를 사용하여 연결 리스트 기반 큐를 사용해볼 예정
        *  LinkedList는 DoublyLinkedList 기반으로, Queue 연산(offer, poll)에 효율적임
        * */
        Queue<Integer> queue = new LinkedList<>();

        System.out.println("-------Queue에 요소를 추가하는 offer()---------");
        // boolean offer(E e): Queue 뒤에 요소 e 추가
        // LinkedList는 용량 제한이 없어서 항상 true 반환
        queue.offer(10); // [10] front: [10] rear: [10]
        queue.offer(20); // [10, 20] front: [10] rear: [20]
        queue.offer(30); // [10, 20, 30] front: [10] rear: [30]
        queue.offer(40); // [10, 20, 30, 40] front: [10] rear: [40]
        System.out.println("queue = " + queue);

        System.out.println("------------ 큐 맨 앞 요소 확인 peak() ------------");
        // 큐가 비어있을 경우 null 반환
        System.out.println("queue.peek() = " + queue.peek()); // [10]
        System.out.println("queue = " + queue); // [10, 20, 30, 40]

        System.out.println("------------ 큐 맨 앞 요소 제거 poll() ------------");
        // 큐가 비어있을 경우 null 반환
        System.out.println("queue.poll() = " + queue.poll()); // 10
        System.out.println("queue = " + queue); // [20, 30, 40]


        System.out.println("------------ 큐 가 비어있는지 확인 isEmpty() ------------");
        System.out.println("queue.isEmpty() = " + queue.isEmpty());
        
    }

}
