public class IntrensicLockSyncStatement {
 
  int x1 = 0;
  int x2 = 0;
  Object internsicLock1 = new Object();
  Object internsicLock2 = new Object();

  public void inc1(String name){
      
      synchronized(internsicLock1){
        System.out.println("lock n.1 "+name+" : "+ ++x1);
      }
    };

  public void inc2(String name){
      
      synchronized(internsicLock2){
        System.out.println("lock n.2 "+name+" : "+ ++x2);
      }
    };


 
  public static void main(String[] args) {
    
    IntrensicLockSyncStatement ils = new IntrensicLockSyncStatement();
    Thread th1 = new Thread(()->{
      ils.inc1("th1");
      ils.inc2("th2");
    });
    
    Thread th2 = new Thread(()->{
      ils.inc2("th2");
      ils.inc1("th1");
    }); 

    th1.start();
    th2.start();
  }
}
