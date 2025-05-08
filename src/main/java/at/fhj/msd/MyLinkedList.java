public class MyLinkedList<E> {

    private static class Node<E> {
        E data;
        Node<E> next;
        Node<E> prev;

        Node(E data, Node<E> prev, Node<E> next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E first() {
        if (isEmpty()) return null;
        return head.data;
    }

    public E last() {
        if (isEmpty()) return null;
        return tail.data;
    }

    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e, null, head);
        if (isEmpty()) {
            tail = newNode;
        } else {
            head.prev = newNode;
        }
        head = newNode;
        size++;
    }

    public void addLast(E e) {
        Node<E> newNode = new Node<>(e, tail, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }

    public E removeFirst() {
        if (isEmpty()) return null;
        E answer = head.data;
        head = head.next;
        size--;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
        return answer;
    }

    public E removeLast() {
        if (isEmpty()) return null;
        E answer = tail.data;
        tail = tail.prev;
        size--;
        if (tail != null) {
            tail.next = null;
        } else {
            head = null;
        }
        return answer;
    }
}