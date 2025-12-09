package com.ohgiraffers.section03.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/* 문제 설명
*   - 입력된 문자열이 올바른 괄호 쌍으로 이루어져 있는지 판별
*   - '(', ')' 개수가 같아야 함
*   - 모든 ')' 괄호는 자신보다 앞에 있는 '('괄호와 짝을 이뤄야 한다
*
*  해결 전략
*   - Stack 활용
*   - '(' 괄호를 만나면 Stack에 push
*   - ')' 괄호를 만나면 Stack에 pop
*       -> 만약 Stack이 비어있는데 pop을 시도한다 == 쌍이 맞지 않는다.
*           --> return "NO"
*   - 모든 문자열을 순회하면서 push/pop 수행했는데 Stack에 남은 '('가 있다 == 쌍이 맞지 않는다.
*       --> return "NO"
*   - 위의 두 경우가 아니라면 return "YES"
* */
public class B9012 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 입력 데이터의 개수
        int T = Integer.parseInt(br.readLine());

        for (int i=0; i<T; i++) {
            sb.append(solution(br.readLine())).append("\n");
        }

        System.out.println(sb);
    }

    public static String solution(String s) {
        // '('를 닫는 스택
        Stack<Character> stack = new Stack<>();

        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i); // String s의 i번째 원소 추출
            if (ch == '('){
                stack.push(ch);
            }else {
                if (stack.isEmpty()){
                    // 비어있으면 짝이 맞지 않다 == 실패
                    return "NO";
                }else {
                    stack.pop();
                }
            }
        }

        // for문이 끝난 후에도 '('가 남아있음 == 쌍이 맞지 않는다 ==> return "NO"
        if (!stack.isEmpty()) {
            return "NO";
        }else {
            return "YES";
        }
    }
}
