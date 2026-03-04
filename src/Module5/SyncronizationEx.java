package Module5;




    class Counter {
        int count = 0;

        synchronized void increment() {
            count++;
        }
    }

    class MyThread1 extends Thread {
        Counter counter;

        MyThread1(Counter counter) {
            this.counter = counter;
        }

        public void run() {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        }
    }

    public class SyncronizationEx {
        public static void main(String[] args) throws InterruptedException {

            Counter counter = new Counter();

            MyThread t1 = new MyThread();
            MyThread t2 = new MyThread();

            t1.start();
            t2.start();

            t1.join();   // Wait for thread 1 to finish
            t2.join();   // Wait for thread 2 to finish

            System.out.println("Final Counter Value: " + counter.count);
        }
    }

