import java.lang.Thread;
import java.time.LocalDateTime;


public class ThreadsJoin {

  public static void main(String[] args) {
    Thread T1 = new Thread(()->{
      try {
        //waiting for 3 seconds

        Thread.sleep(3000);

      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    });    
    
    Thread T2 = new Thread(()->{
      try {
        //waiting for 1 seconds
        System.out.println("start time "+ LocalDateTime.now());
        Thread.sleep(1000);
        T1.join();
        System.out.println("Finishing time "+ LocalDateTime.now());
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    });
   
    T1.start();
    T2.start();
  }
}
  
