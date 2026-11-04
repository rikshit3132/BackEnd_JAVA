package LLD_7.operations_Extra;

import java.util.concurrent.Callable;

public class Basic implements Callable<Integer> {
    int first;
    int second;
    Basic(int first, int second){
        this.first = first;
        this.second = second;
    }
    @Override
    public Integer call(){
        System.out.println("Current Thread: "+ Thread.currentThread().getName());
        return first + second;
    }
}
