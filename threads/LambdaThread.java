

public class LambdaThread {
 
  public static void main(String[] args){
    Thread mthread = new Thread( new Runnable() {
      
      @Override
      public void run() {
        System.out.println("This is a thread");
      }
    });

    mthread.start();
  }
}
  
