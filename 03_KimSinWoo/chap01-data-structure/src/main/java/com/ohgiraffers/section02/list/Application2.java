package com.ohgiraffers.section02.list;

public class Application2 {

    public static void main(String[] args) {

        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

        myLinkedList.add(10);
        myLinkedList.add(20);
        myLinkedList.add(30);
        myLinkedList.add(40);

        /* 중간 삽입 확인 */
        myLinkedList.add(2, 999);

        System.out.println("myLinkedList = " + myLinkedList);

        /* get() 확인 */
        System.out.println("myLinkedList.get(2) = " + myLinkedList.get(2));

        /* remove() 확인 */
        myLinkedList.remove(2);
        System.out.println("myLinkedList = " + myLinkedList);
    }
}
