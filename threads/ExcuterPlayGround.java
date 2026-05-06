import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.lang.Thread;

public class ExcuterPlayGround {


  public static void main(String[] args) {
    ExecutorService ex = Executors.newFixedThreadPool(10);
    for(int i = 0; i < 30; i++) {
      final int index = i;
      ex.execute(() -> {
        System.out.println("Hello from thread: " + Thread.currentThread().getName() + " with index: " + index);
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      });
    }

    ex.shutdown();
  }
}
