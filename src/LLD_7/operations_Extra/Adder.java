package LLD_7.operations_Extra;

import java.util.concurrent.Callable;

public class Adder implements Callable<Integer> {
    @Override
    public Integer call(){
        return  10 + 20;
    }
}
