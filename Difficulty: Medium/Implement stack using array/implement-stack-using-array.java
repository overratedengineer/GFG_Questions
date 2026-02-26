class myStack {

    int arr[];
    int top;
    int capacity;

    public myStack(int n) {
        capacity = n;
        arr = new int[n];
        top = -1;
    }

    public boolean isEmpty() {
        if(top == -1) return true;
        return false;
    }

    public boolean isFull() {
        if(top == capacity - 1) return true;
        return false;
    }

    public void push(int x) {
        if(isFull()){
            return;
        }
        top++;
        arr[top] = x;
    }

    public void pop() {
        if(isEmpty()){
          
            return;
        }
        top--;
    }

    public int peek() {
        if(isEmpty()){
            return -1;
        }
        return arr[top];
    }
}