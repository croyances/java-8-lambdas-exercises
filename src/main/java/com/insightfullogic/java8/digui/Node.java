package com.insightfullogic.java8.digui;


public class Node {
    private int Data;
    private Node next;

    public int getData() {
        return Data;
    }

    public void setData(int data) {
        Data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public static int fib(int N) {
        if (N == 0) {
            return 0;
        } else if (N == 1) {
            return 1;
        }
        return fib(N - 1) + fib(N - 2);
    }

    public static void main(String[] args) {
        Node node = new Node();
        node.Data = 1;
        node.next = new Node();
        node.next.Data = 2;
        node.next.next = new Node();
        node.next.next.Data = 3;
        node.next.next.next = new Node();
        node.next.next.next.Data = 4;
        node.next.next.next.next = null;

        Node node1 = reverseList(node);
        System.out.println(node1);

//        int fib = fib(5);
//        System.out.println(fib);
    }

    static Node reverseList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // 我们先把递归的结果保存起来，先不返回，因为我们还不清楚这样递归是对还是错。，
        Node newList = reverseList(head.next);
        Node t1 = head.next;
        // 让 2 的 next 指向 2
        t1.next = head;
        // 1 的 next 指向 null.
        head.next = null;
        // 把调整之后的链表返回。
        return newList;

    }
}
