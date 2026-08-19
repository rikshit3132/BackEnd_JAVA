package LLD_8_Callables;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws Exception {
        List<Integer> data = List.of(2,4,6,4,76,7,9,1);

 // better to use newCached ThreadPool no need to take the size of pool
//        no deadlock here
        ExecutorService executorService = Executors.newCachedThreadPool();

//Deadlock situation will arrise when we use fixedThreadPool()
//        ExecutorService executorService = Executors.newFixedThreadPool(2);

        MergeSorter mergeSorter = new MergeSorter(data,executorService);

        Future<List<Integer>> sortedDataFuture = executorService.submit(mergeSorter);
        List<Integer> sortedData = sortedDataFuture.get();
//        Blocking call -> Thread waits until results are ready


        //        List<Integer> sortedData = mergeSorter.call();
        System.out.println("Sorted Data : "+sortedData);
        executorService.shutdown();



    }
}
