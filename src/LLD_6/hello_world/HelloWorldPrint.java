package LLD_6.hello_world;

public class HelloWorldPrint implements Runnable {
    @Override
    public void run(){
        System.out.println("Hello World!!");
        System.out.println("Iam Thread: "+Thread.currentThread().getName());
    }
}
