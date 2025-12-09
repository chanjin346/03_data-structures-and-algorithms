package com.ohgiraffers.section02.list;

public class Application1 {
  public static void main(String[] args) {
    /* MyArrayList 테스트 */
    MyArrayList<Integer> myArrayList = new MyArrayList<>(3);

    System.out.println(myArrayList.isEmpty());

    myArrayList.add(10);
    myArrayList.add(20);
    myArrayList.add(30);
    myArrayList.add(40);

    /* 중간 삽입 확인 */
    myArrayList.add(2, 999);

    /* 삭제 확인 */
    myArrayList.remove(1);

    /* get(), size() 확인 */
    for (int i = 0; i < myArrayList.size(); i++) {
      System.out.println("get("+i+") = " + myArrayList.get(i));
    }

    System.out.println(myArrayList.isEmpty());

    System.out.println(myArrayList);

    System.out.println("===== 종료 =====");
  }
}
