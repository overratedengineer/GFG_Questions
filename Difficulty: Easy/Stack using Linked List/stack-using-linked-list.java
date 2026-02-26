class myStack {

    Node top;
    int size;

    public myStack() {
        top = null;
        size = 0;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int x) {
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public void pop() {
        if(isEmpty()) return;

        top = top.next;
        size--;
    }

    public int peek() {
        if(isEmpty()) return -1;
        return top.data;
    }

    public int size() {
        return size;
    }
}