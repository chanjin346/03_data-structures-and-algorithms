package com.ohgiraffers.section02.list;

import java.util.ArrayList;
import java.util.List;

public class Application1 {

    public static void main(String[] args) {
        /* MyArrayList 테스트 */
        MyArrayList<Integer> myArrayList = new MyArrayList<>(3);

        System.out.println("myArrayList.isEmpty() = " + myArrayList.isEmpty());

        myArrayList.add(10);
        myArrayList.add(20);
        myArrayList.add(30);
        myArrayList.add(40); // 용량 증가 확인

        /* 중간 삽입 테스트 */
        myArrayList.add(2, 999);

        System.out.println(myArrayList);

        System.out.println("myArrayList.isEmpty() = " + myArrayList.isEmpty());

        myArrayList.remove(2);

        System.out.println(myArrayList);

        System.out.println("====종료====");

    }

}
