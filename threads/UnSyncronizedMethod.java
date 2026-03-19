

public class UnSyncronizedMethod {
 
  static volatile int c =0;
 
  public static void counter(String name){
     System.out.println(name+" : "+ ++c);
  }
  public static void sub(String name){
     System.out.println(name+" : "+ --c);
  }
 
  public static void main(String[] args) {
    Thread USThread = new Thread(()-> {
      for(int i=0;i<10;i++)
        counter("Thread 1");
    });

    Thread USThread2 = new Thread(()-> {
      for(int x=0;x<10;x++)
        sub("Thread 2");
    }); 

    USThread.start();
    USThread2.start();
  }
}
