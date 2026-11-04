package LLD_7.operations_Extra;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo2 {
    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Callable<Integer> task1 = (() -> {
            Thread.sleep(2000);
            return 100;
        });

        Callable<Integer> task2 = (() -> {
            Thread.sleep(3000);
            return 200;
        });
        Future<Integer> future2 = executorService.submit(task2);
        System.out.println(future2.isCancelled());
        System.out.println(future2.isDone());
        Callable<Integer> task3 = (() -> {
            Thread.sleep(1000);
            return 300;
        });

        Future<Integer> future1 = executorService.submit(task1);

        Future<Integer> future3 = executorService.submit(task3);

        System.out.println(future1.get());
        System.out.println(future2.get());
        System.out.println(future3.get());

        System.out.println(future2.isCancelled());
        System.out.println(future2.isDone());
 executorService.shutdown();

    }
}
