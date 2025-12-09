package com.ohgiraffers.section03.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 백준 9012. 괄호 */
public class B9012 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int T = Integer.parseInt(br.readLine());

    for(int i = 0; i < T; i++){
      sb.append(solution(br.readLine()));
      sb.append("\n");
    }

    System.out.println(sb.toString());

  }

  public static String solution(String s){
    char ch;
    int cnt = 0;
    for(int i = 0; i < s.length(); i++){
      ch = s.charAt(i);
      switch(ch){
        case '(':
          cnt++;
          break;
        case ')':
          cnt--;
          break;
      }
      if(cnt < 0) {
        return "NO";
      }
    }
    if(cnt != 0) {
      return "NO";
    }
    return "YES";
  }

}
