
import java.lang.Thread;

public class InheritedTread extends Thread{

  @Override
  public void run() {
    try {
      for(int i =0;i<50;i++){
        System.out.println("InheritedTread");
        sleep(2000L);
      }  
    } catch (Exception e) {
      System.out.println("we got an interrupt so hurray");
    }

  }

  public static void main(String[] args) {
    Thread mThread = new InheritedTread();
    mThread.run();
  }
}

