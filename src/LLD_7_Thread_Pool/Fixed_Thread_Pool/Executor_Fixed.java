package LLD_7_Thread_Pool.Fixed_Thread_Pool;

import java.util.concurrent.Executors;

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
