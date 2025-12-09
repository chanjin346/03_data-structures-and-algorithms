package com.ohgiraffers.section03.stack;

/* Stack
* - 후입선출(LIFO)
* 
* Java 제공 Stack 클래스
* - java.util 패키지
* - Vector 클래스를 상속함
* 
* - 최근에는 Stack 대신 Deque을 상속 받은 ArrayDeque을 사용하도록 권장
* */

import java.util.Stack;

public class Application {
  public static void main(String[] args) {
    
    /* Integer 타입을 저장하는 Stack 객체 생성 */
    Stack<Integer> stack = new Stack<>();

    System.out.println("===== 스택에 요소 추가 - push() =====");
    stack.push(1); // 스택: [1]
    stack.push(2); // 스택: [1, 2]
    stack.push(3); // 스택: [1, 2, 3]
    System.out.println("stack = " + stack);

    System.out.println("===== 최상단 요소 확인 - peek() =====");

    // stack이 비어있는 상태에서 peek(), pop() 수행 시
    // EmptyStackException이 발생한다.
    if(stack != null && !stack.isEmpty()){
      System.out.println(stack.peek());
      System.out.println("stack = " + stack);
    }

    System.out.println("===== 스택에서 마지막 요소를 제거하는 - pop() =====");
    while(stack != null && !stack.isEmpty()){
      System.out.println(stack.pop());
      System.out.println("stack = " + stack);
    }


  }
}
