class stackException extends Exception {
    stackException(String msg) {
        super(msg);
    }
}

class stack {
    int capacity;
    int top = -1;
    int[] arr;

    stack(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
    }

    void push(int num) {
        try {
            if (++top < capacity) {
                this.arr[top] = num;
            } else {
                throw new stackException("Stack Overflow");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    int pop() {
        try {
            if (top > -1) {
                int temp = this.arr[top];
                this.arr[top] = 0;
                --top;
                return temp;
            } else {
                throw new stackException("Stack is Empty");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return -1;
        }
    }
}

class one {
    protected String name = "hh";
}

class two extends one {
    public void d() {
        System.out.println(name);
    }
}

class stackTest {
    public static void main(String args[]) {
        two gg = new two();
        gg.d();
    }
}