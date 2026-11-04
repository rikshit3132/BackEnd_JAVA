package LLD_7.operations_Extra;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client2 {
    public static void main(String[] args) throws Exception{
        Adder adder = new Adder();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Integer> future = executorService.submit(adder);
        int ans = future.get();
        System.out.println(ans);
        executorService.shutdown();
    }
}
