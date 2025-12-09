package com.ohgiraffers.section03.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B1158 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String line = br.readLine();
    StringTokenizer st = new StringTokenizer(line, " ");
    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());
    int cnt = 0;
    List<Integer> list = new ArrayList<Integer>();

    int val = 0;
    while(cnt < N) {
      int cnt_temp = 0;
      while(cnt_temp < K) {
        val++;
        if (!list.contains(val)) cnt_temp++;
        if (val > N) val -= N;
      }
      list.add(val);
      cnt++;
    }
    System.out.println(list);
  }
}
