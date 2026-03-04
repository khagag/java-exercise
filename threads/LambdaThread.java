import java.lang.InterruptedException;
import java.lang.Thread;

public class LambdaThread {
 
  public static void main(String[] args){
    Thread mthread = new Thread( new Runnable() {
      
      @Override
      public void run() {
        try {
          for(int i=0;i<=50;i++){
           System.out.println("This is a thread from LambdaThread");
           Thread.sleep(3000);
           if(i>12){
             throw new InterruptedException();
           }
         }
        } catch (Exception e) {
          System.out.println("an interrupt happened");
        }
     }
    });

    mthread.start();
  }
}
  
