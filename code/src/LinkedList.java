interface Collection<A> {
    public void add (A x);
    public Iterator<A> iterator ();
}
interface Iterator<A> {
    public A next ();
    public boolean hasNext ();
}
class NoSuchElementException extends RuntimeException {}
class LinkedList<A> implements Collection<A> {
    protected class Node {
        A elt;
        Node next = null;

        Node(A elt) {
            this.elt = elt;
        }
    }

    protected Node head = null, tail = null;
    public void add (A elt) {
        if (head == null) {
            head = new Node(elt);
            tail = head;
        } else {
            tail.next = new Node(elt);
            tail = tail.next;
        }
    }
    public Iterator<A> iterator () {
        return new Iterator<A>() {
            protected Node ptr = head;

            public boolean hasNext() {
                return ptr != null;
            }

            public A next() {
                if (ptr != null) {
                    A elt = ptr.elt;
                    ptr = ptr.next;
                    return elt;
                } else {
                    throw new NoSuchElementException();
                }
            }
        };
    }
}