package com.ohgiraffers.section03.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10799 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int answer;

    answer = solution(br.readLine());
    System.out.println(answer);

  }

  public static int solution(String s){
    char before_ch = 0;
    char ch;
    int depth = 0;
    int cnt = 0;
    for(int i = 0; i < s.length(); i++) {
      ch = s.charAt(i);
      if(ch == '(') {
        depth++;
      }
      else if(ch == ')') {
        depth--;
        if(before_ch == '(') {
          cnt += depth;
        }
        else {
          cnt++;
        }
      }

      before_ch = ch;
    }
    return cnt;
  }
}
