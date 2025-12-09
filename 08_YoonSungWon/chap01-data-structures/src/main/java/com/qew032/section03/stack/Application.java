package com.qew032.section03.stack;


import java.util.Stack;

public class Application {
    public static void main(String[] args) {
        /* Integer 타입을 저장하는 Stack 객체 생성 */
        Stack<Integer> stack = new Stack<>();

        System.out.println("===== 스택에 요소 추가 - push() =====");
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("stack = " + stack);

        System.out.println("===== 최상단 요소 확인 - peek() =====");


        if (stack != null && !stack.isEmpty()) {
            System.out.println("peek() 결과 : " + stack.peek());
            System.out.println("peek() 호출 후 결과 : " + stack);
        }

        System.out.println("===== 스택에서 마지막 요소를 제거하는 /뽑아내는 =====");
        System.out.printf("pop 결과 : %d / 현재 스택 : %s \n", stack.pop(), stack);
        System.out.printf("pop 결과 : %d / 현재 스택 : %s \n", stack.pop(), stack);
        System.out.printf("pop 결과 : %d / 현재 스택 : %s \n", stack.pop(), stack);

    }
}
