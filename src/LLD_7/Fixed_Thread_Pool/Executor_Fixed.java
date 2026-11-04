package LLD_7.Fixed_Thread_Pool;

public class Executor_Fixed implements Runnable{
    private  int number;
    Executor_Fixed(int number){
        this.number = number;
    }
    @Override
    public void run(){
        System.out.println("The number is: "+number+" Thread: "+Thread.currentThread().getName());
    }

}
