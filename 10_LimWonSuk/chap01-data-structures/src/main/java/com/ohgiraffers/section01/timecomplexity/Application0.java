package com.ohgiraffers.section01.timecomplexity;

import java.util.Arrays;

// 배열을 거꾸로 나열하는 방법
public class Application0 {
    public static void main(String[] args) {

        int[] arr = {3, 2 ,5 ,11, 22, 91, 2, 21};

        System.out.println("배열 : " + Arrays.toString(arr));

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(arr));

    }



    }





