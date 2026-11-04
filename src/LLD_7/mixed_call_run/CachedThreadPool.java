package LLD_7.mixed_call_run;

public class CachedThreadPool implements Runnable {
    int number;
    CachedThreadPool(int number){
        this.number = number;
    }
    @Override
    public void run(){
        System.out.println("Thread: "+Thread.currentThread().getName()+" Number"+number);
    }
}
