package MultiThreadingAndMultiProgramming;
class MyThread2 extends Thread{
    @Override
    public void run() {
        int count = 0;
        while (true){
            System.out.println(++count + " MyThread");
        }
    }
}
public class DaemonJoinAndYieldMethods {
    public static void main(String[] args){
        var t = new MyThread2();
        //t.setDaemon(true);// this thread does not print anything on the screen as it depends solely on the main thread hence it stops the moment the main method stops executing
        t.start();
        // this try method is to show that the main method actually calls the start method of the thread before actually stopping
      /*  try {
            Thread.sleep(100);
        }catch (Exception e){
            //
        }*/

        /*var main = Thread.currentThread();
        try {
            main.join(); // this forces the main thread from the main method to wait until the thread "t" finishes executing;
        }catch (InterruptedException e){
            //
        }*/

        int count = 0;
        while (true){
            System.out.println(++count + " Main");
            Thread.yield();
        }
    }
}
