package com.ohgiraffers.section03.stack;

import java.util.Stack;

/* Stack
*   - 후입선출(Last In First Out) 원칙을 따르는 선형 자료 구조
*
* Java 제공 Stack클래스
* - Java.util 패키지
* - Vector 클래스를 상속하여 만들어짐
*   -> 내부 배열의 크기를 동적으로 조정할 수 있음
*
* - 최근에는 Stack 대신 Deque를 상속 받은 ArrayDeque를 사용하도록 권장
* */
public class Application {

    public static void main(String[] args) {
        /* integer타입을 저장하는 Stack 객체 생성 */
        Stack<Integer> stack = new Stack<>();

        System.out.println("=======스택 요소 추가 push()==========");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println("stack = " + stack);

        System.out.println("========최상단 요소 확인 peek()==========");
        // stack이 비어있는 상태에서 peek(), pop() 수행 시 EmptyStackException이 발생한다.
        if (stack != null && !stack.isEmpty()) {
            System.out.println("stack.peek() = " + stack.peek());
            System.out.println("stack = " + stack);
        }

        System.out.println("=========스택에서 마지막 요소를 제거하는/뽑아내는 pop()=============");
        System.out.printf("pop 결과 : %d / 현재 스택 : %s \n", stack.pop(), stack);
        System.out.printf("pop 결과 : %d / 현재 스택 : %s \n", stack.pop(), stack);
        System.out.printf("pop 결과 : %d / 현재 스택 : %s \n", stack.pop(), stack);
        System.out.printf("pop 결과 : %d / 현재 스택 : %s \n", stack.pop(), stack);

    }

}
