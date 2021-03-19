import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {
    final static int MAX_THREADS = 4;

    public static void main(String[] args) {
        ThreadGroup threadGroup = new ThreadGroup("main");
        ThreadPoolExecutor executor= (ThreadPoolExecutor) Executors.newFixedThreadPool(MAX_THREADS);
        for (int i = 0; i < MAX_THREADS; i++) {
            executor.submit(new HelloThread());
        }

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Завершаю все потоки.");
        executor.shutdownNow();
    }
}
