import java.time.LocalDateTime;

public class HelloThread extends Thread {
    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                Thread.sleep(2500);
                System.out.printf("Всем привет! Я %s. и сейчас на часах %s \n", Thread.currentThread().getName(), LocalDateTime.now());
            }

        } catch (InterruptedException e) {
        } finally {
            System.out.printf("Поток %s завершен\n", Thread.currentThread().getName());
        }
    }
}
