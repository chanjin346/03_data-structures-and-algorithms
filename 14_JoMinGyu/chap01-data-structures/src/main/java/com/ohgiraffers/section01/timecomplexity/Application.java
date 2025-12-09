package com.ohgiraffers.section01.timecomplexity;

public class Application {
  public static void main(String[] args) {
    int[] arr = {5, 3, 1, 4, 2};
    arr = reverse(arr);

    for(int i = 0; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }

  private static int[] reverse(int[] arr) {
    for(int i = arr.length - 1; i >= arr.length / 2; i--) {
      int temp = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = temp;
    }
    return arr;
  }

  private static int[] reverse2(int[] arr) {
    int[] arr2 = new int[arr.length];

    for(int i = arr2.length - 1; i >= arr2.length / 2; i--) {
      arr2[arr2.length - i - 1] = arr[i];
    }
    return arr2;

  }
}
