import java.lang.Thread;


//wait method releases the lock so you shouldn't modify the object before and after it in most cases 
//as the result would be corrupted in most cases

public class GuardedLock {
  
  volatile static String lock = "";
  
    
    synchronized public void  lock1(){
      try {
        while(!lock.equals("lock1")){
          wait();
        }
        System.out.println("lock1 is released");
      } catch (Exception e) {
        
      }
    }
  
  public synchronized void  lock2(){
      try {
        while(!lock.equals("lock2")){
          wait();
        }
        System.out.println("lock2 is released");

      } catch (Exception e) {
        
      }
  }

  public synchronized void unlock(String str){
    lock = str;
    notifyAll();
  }
  public static void main(String[] args) {
           GuardedLock GL = new GuardedLock();
    new Thread(()->
         {
           GL.lock2();
        }).start();
     new Thread(()->{
           GL.lock1();
    }).start();
    new Thread(()->{
           GL.unlock("lock1");
    }).start();
  }
  
}
