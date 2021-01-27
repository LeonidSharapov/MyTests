package valera.LinkedList;

import java.security.PublicKey;
import java.util.Iterator;

public class MyList<E> implements Link<E>,Iterable<E>, MyIterator<E> {
    private Node<E> first;
    private Node<E> last;
    private int size = 0;
    public MyList(){
        last=new Node<E>(null,first,null);
        first=new Node<E>(null,null,last);
    }
    @Override
    public void addLast(E e) {
        Node<E> prev = last;
        prev.setIs_element(e);
        last = new Node<E>(null, prev, null);
        prev.setNext_element(last);
        size++;
    }

    @Override
    public void addFirst(E e) {
        Node<E> one =first;
        one.setIs_element(e);
        first=new Node<E>(null,null,one);
        one.setBack_element(first);
        size++;

    }

    @Override
    public int size() {
        return size;
    }


    @Override
    public E getElementByIndex(int counter) {
       Node<E> select=first.getNext_element();
       for(int i=0; i<counter;i++){
           select=getNextElement(select);
       }
       return select.getIs_element();
    }

    public Node<E> getNextElement(Node<E> a) {
        return a.getNext_element();
    }


    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int counter= 0;
            @Override
            public boolean hasNext() {
                return counter<size;
            }

            @Override
            public E next() {
                return getElementByIndex(counter++) ;
            }
        };
    }

    @Override
    public Iterator<E> descendingIterator() {
        return new Iterator<E>() {
            int counter=size-1;
            @Override
            public boolean hasNext() {
                return counter>=0;
            }

            @Override
            public E next() {
                return getElementByIndex(counter--);
            }
        };
    }



    //NODE CLASS
    protected class Node<E> {
        private E is_element;
        private Node<E> next_element;
        private Node<E> back_element;


        private Node(E is_element, Node<E> back_element, Node<E> next_element) {
            this.back_element = back_element;
            this.is_element = is_element;
            this.next_element = next_element;
        }

        public E getIs_element() {
            return is_element;
        }

        public void setIs_element(E is_element) {
            this.is_element = is_element;
        }

        public Node<E> getNext_element() {
            return next_element;
        }

        public void setNext_element(Node<E> next_element) {
            this.next_element = next_element;
        }

        public Node<E> getBack_element() {
            return back_element;
        }

        public void setBack_element(Node<E> back_element) {
            this.back_element = back_element;
        }
    }
}
