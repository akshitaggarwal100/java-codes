class myThread implements Runnable {
    String text;
    int s, e;

    myThread(String text, int s, int e) {
        this.text = text;
        this.s = s;
        this.e = e;
    }

    public void run() {
        for (int i = s; i <= e; i++) {
            System.out.println(text + i);
        }
    }
}

class q1 {
    public static void main(String[] args) {
        // Runnable is an interface so, does not have setPriority(), start()
        // so, they are are passed to Thread constructor
        // if mThread made with extending Thread class, then its constructor can be used directly
        Thread mThread = new Thread(new myThread("Java", 1, 10));
        Thread yThread = new Thread(new myThread("Programming", 1, 10));

        mThread.setPriority(7);
        yThread.setPriority(7);

        mThread.start();
        yThread.start();

    }
}