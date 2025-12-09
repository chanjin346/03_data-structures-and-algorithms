package com.ohgiraffers.section05.deque;


import java.util.ArrayDeque;
import java.util.Deque;

/* Deque (Double Ended Queue)
 * - 큐의 양쪽 끝으로 요소의 삽입, 삭제가 모두 가능한 선형 자료구조
 * - 스택, 큐의 기능을 모두 수행할 수 있음
 * 주요 연산:
 * - 맨 앞 추가: addFirst(e), offerFirst(e)
 * - 맨 뒤 추가: addLast(e), offerLast(e)
 * - 맨 앞 제거: removeFirst(), pollFirst()
 * - 맨 뒤 제거: removeLast(), pollLast()
 * - 맨 앞 조회: getFirst(), peekFirst()
 * - 맨 뒤 조회: getLast(), peekLast()
 *
 * 컬렉션 프레임워크에는 Deque 인터페이스와 구현체가 존재하고 있습니다
 * 주로 배열 기반의 동적 큐인 ArrayDeque 클래스를 활용
 * ArrayDeck 클래스는 스레드 안전(thread-safe)하지 않지만
 * LinkedList보다는 일반적으로 빠르다.
 * */
public class Application {

    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();
        System.out.println("------덱에 요소 추가 - addfirst, addLast -----");
        deque.addLast(1);
        deque.addLast(2);
        deque.addLast(3);
        deque.addLast(4);
        deque.addLast(5);
        System.out.println("addLast()후 deque = " + deque); // [1, 2, 3, 4, 5]

        deque.addFirst(0);
        System.out.println("addFirst()후 deque = " + deque); // [0, 1, 2, 3, 4, 5]

        System.out.println("--------덱의 앞/뒤 요소 확인---getFirst(), getLast()--------");
        System.out.println("deque.getFirst() = " + deque.getFirst());
        System.out.println("deque.getLast() = " + deque.getLast());
        System.out.println("deque = " + deque);

        System.out.println("--------덱의 앞/뒤 요소 제거---removeFirst(), removeLast()--------");
        System.out.println("deque.removeFirst() = " + deque.removeFirst());
        System.out.println("deque.removeLast() = " + deque.removeLast());
        System.out.println("deque = " + deque);

        System.out.println("------------덱이 비어있는지 확인 --isEmpty()------------");
        System.out.println("deque.isEmpty() = " + deque.isEmpty());
        deque.clear();
        System.out.println("deque.isEmpty() = " + deque.isEmpty());





    }

}
