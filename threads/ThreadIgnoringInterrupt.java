
import java.lang.Thread;
import java.lang.InterruptedException;

public class ThreadIgnoringInterrupt extends Thread{

  @Override
  public void run() {
    try {
      for(int i =0;i<5000;i++){

        System.out.println("Innocent interrupt");
        if (Thread.interrupted()) {
          System.out.println("Thug life Thread: you've a an interrupt i don't care");
         }

      }  
    } catch (Exception e) {
      System.out.println("we got an interrupt so hurray");
    }

  }

  public static void main(String[] args) throws InterruptedException{
    Thread mThread = new ThreadIgnoringInterrupt();
    mThread.start();
    Thread.sleep(100);
    mThread.interrupt();
  }
}

