package MultiThreadingAndMultiProgramming;
class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
}

class MyRun implements Runnable{
    @Override
    public void run() {
        int count = 0;
        while (true){
            System.out.println(++count);
            try {
                Thread.sleep(1_000);
            }catch (InterruptedException e){
                //
            }
        }
    }
}
public class ThreadConstructorsAndMethods {
    public static void main(String[] args){
        var t = new MyThread("Rol"); // using a class for multiThreading
        /*System.out.println(t.getName());
        System.out.println(t.getPriority());
        System.out.println(t.getState());
        t.start();
        System.out.println("After the start() method is called");
        System.out.println(t.getState());
        t.setPriority(1);
        System.out.println(t.getPriority());*/

        var r = new Thread(new MyRun(), "Rol"); // giving a class that implements Runnable to the Thread class as well as giving it a name.

        r.start();
    }
}
