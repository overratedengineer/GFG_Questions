class myQueue {

    int arr[];
    int front;
    int rear;
    int capacity;

    public myQueue(int n) {
        capacity = n;
        arr = new int[n];
        front = -1;
        rear = -1;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return (front == 0 && rear == capacity - 1) || (front == rear + 1);
    }

    public void enqueue(int x) {

        if(isFull()) return;

        if(front == -1){
            front = 0;
            rear = 0;
        }
        else if(rear == capacity - 1){
            rear = 0;
        }
        else{
            rear++;
        }

        arr[rear] = x;
    }

    public void dequeue() {

        if(isEmpty()) return;

        if(front == rear){
            front = -1;
            rear = -1;
        }
        else if(front == capacity - 1){
            front = 0;
        }
        else{
            front++;
        }
    }

    public int getFront() {
        if(isEmpty()) return -1;
        return arr[front];
    }

    public int getRear() {
        if(isEmpty()) return -1;
        return arr[rear];
    }
}