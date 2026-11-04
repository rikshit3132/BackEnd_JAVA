package LLD_7.Cached_Thread_Pool;

public class CacheExecutor implements Runnable {
    private  int number;
    CacheExecutor(int number){
        this.number = number;
    }
    @Override
    public void run(){
        System.out.println("The number is: "+number+" Thread: "+Thread.currentThread().getName());
    }
}
