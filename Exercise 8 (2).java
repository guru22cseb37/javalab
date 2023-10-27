import java.util.concurrent.ArrayBlockingQueue;
public class ThreadSafeQueueExample {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
        Thread producerThread = new Thread(new Producer(queue));
        Thread consumerThread = new Thread(new Consumer(queue));
        producerThread.start();
        consumerThread.start();
    }
    static class Producer implements Runnable {
        private final ArrayBlockingQueue<Integer> queue;
        public Producer(ArrayBlockingQueue<Integer> queue) {
            this.queue = queue;
        }
        public void run() {
            try {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Producing: " + i);
                    queue.put(i);
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
    static class Consumer implements Runnable {
        private final ArrayBlockingQueue<Integer> queue;
        public Consumer(ArrayBlockingQueue<Integer> queue) {
            this.queue = queue;
        }
        public void run() {
            try {
                for (int i = 1; i <= 10; i++) {
                    int item = queue.take();
                    System.out.println("Consuming: " + item);
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
