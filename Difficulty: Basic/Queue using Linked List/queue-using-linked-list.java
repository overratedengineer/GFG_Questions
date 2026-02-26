// Node class
class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

// Queue class
class myQueue {

    Node front;
    Node rear;
    int size;

    public myQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(int x) {
        Node newNode = new Node(x);

        // first element
        if(isEmpty()){
            front = newNode;
            rear = newNode;
        }
        else{
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public void dequeue() {

        if(isEmpty()) return;

        front = front.next;
        size--;

        // if queue becomes empty, rear must also be null
        if(front == null){
            rear = null;
        }
    }

    public int getFront() {
        if(isEmpty()) return -1;
        return front.data;
    }

    public int size() {
        return size;
    }
}