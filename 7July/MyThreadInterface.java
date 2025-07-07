class MyThread implements Runnable {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Thread Running " + i);
        }
    }

    public static void main(String[] args) {
        MyThread myRunnable = new MyThread();
        Thread t = new Thread(myRunnable); // Runnable in a Thread
        t.start(); // Start the thread

        for(int i = 1; i <= 5; i++) {
            System.out.println("Main Thread Running " + i);
        }
    }
}
