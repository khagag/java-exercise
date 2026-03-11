
import java.lang.Thread;
import java.lang.InterruptedException;

public class InheritedTread extends Thread{

  @Override
  public void run() {
    try {
      for(int i =0;i<50;i++){
        System.out.println("InheritedTread");
        sleep(2000L);
        /*if (Thread.interrupted()) {
          throw new InterruptedException(); 
        }*/

      }  
    } catch (Exception e) {
      System.out.println("we got an interrupt so hurray");
    }

  }

  public static void main(String[] args) throws InterruptedException{
    Thread mThread = new InheritedTread();
    mThread.start();
    Thread.sleep(4000);
    mThread.interrupt();
  }
}

