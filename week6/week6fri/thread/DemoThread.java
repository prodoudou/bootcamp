package week6.week6fri.thread;

public class DemoThread {
  public static void main(String[] args) {
    // Approach 1: Runnable (lambda) to implment Thread
    // Task logic
    Runnable printout = ()->{
      for (int i = 0; i < 1000; i++){
        System.out.println("i=" +i);
      }
    };//Step 4

    //Runnable printout = () -> System.out.println("Hello World");// step 4 只係有可能最後 但唔保證
    // Task = Thread
    Thread thread = new Thread(printout);// Task Managament//張task logic 放係管理員入面
    System.out.println("Start thread");// step 1
    thread.start();// step 2 由呢到開始分離
    System.out.println("end thread"); // step 3

    // Approach 2 : Create PrintOut Class implement Runnable
    Thread thread2 = new Thread(new PrintOut());
    System.out.println("Start thread2"); //step 1
    thread2.start();// step2
    System.out.println("end thread2"); // step 3

    //Approach 3: Create PrintOut2 Class extends Threads
    Thread thread3 = new PrintOut2();
    thread3.start();


    try{
      thread.join();
      thread2.join();
      thread3.join();
    } catch(InterruptedException e ){

    }
    System.out.println("Main Thread Ends");
  }
}
