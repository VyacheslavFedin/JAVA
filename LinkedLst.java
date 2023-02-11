import java.util.ArrayList;
// реализовать итератор типа линкед листа, где каждый элемент хранит
// ссылку на следующий
import java.util.Iterator;
import java.util.List;

public class LinkedLst<E> implements Iterable<E> {

    private Node<E> head = null;
    private int counter;

    public LinkedLst() {
        head = new Node<>();
    }

    public int size() {
        return counter;
    }

    public void add(E element) {
        if (counter == 0) {
            head.set(element);
        }

        else {
            head.add(element);
        }
        counter++;
    }

    private class Node<E> {
        private E element;
        private Node<E> next = null;

        Node() {
        }

        Node(E element) {
            set(element);
        }

        void set(E element) {
            this.element = element;
        }

        void add(E element) {
            if (isNext()) {
                next.add(element);
            } else {
                next = new Node<>(element);
            }
        }

        boolean isNext() {
            return next != null;
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new LinkedIterator();
    }

    class LinkedIterator implements Iterator<E> {
        private List<E> llist = new ArrayList<>();

        private int currentIndex = 0;

        public LinkedIterator() {
            this.llist = llist;
        }

        @Override
        public boolean hasNext() {
            return llist.size() > currentIndex;
        }

        @Override
        public E next() {
            return llist.get(currentIndex++);
        }
    }
}
