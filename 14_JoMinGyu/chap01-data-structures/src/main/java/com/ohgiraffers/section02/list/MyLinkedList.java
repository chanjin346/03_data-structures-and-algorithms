package com.ohgiraffers.section02.list;

/*
* 단일 연결 리스트(Singly Linked List) 직접 구현하기
* 각 노드는 데이터 + 다음 노드를 가리키는 포인터로 구성되어 있다.
* */
public class MyLinkedList<T> {

  private Node<T> head;
  private Node<T> tail;
  private int size;

  /* 정적 내부 클래스 - Node
  * - 연결 리스트의 각 요소를 나타내는 역할의 클래스
  * */
  private static class Node<T>{
    T data; // 노드가 저장할 실제 데이터
    Node<T> next; // 다음 노드를 가리키는 포인터
  }

  // 생성자
//  Node(T data){
//    this.data = data;
//    this.next = null;
//  }


  /**
   * 리스트의 끝에 전달받은 요소를 추가
   * 시간 복잡도 : O(1) -
   * @param element
   */
  public void add(T element){

  }

}


