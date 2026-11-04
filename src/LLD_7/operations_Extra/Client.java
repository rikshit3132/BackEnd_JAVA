package LLD_7.operations_Extra;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws Exception {
        Basic basic = new Basic(100,200);
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Integer> ans = executorService.submit(basic);
        int c = ans.get();
        System.out.println(c);
        executorService.shutdown();
    }
}
