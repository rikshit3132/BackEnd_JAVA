package LLD_7_Thread_Pool.Fixed_Thread_Pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(10);
        for (int i = 1; i <= 100 ; i++) {
            if(i == 5 || i == 11 || i == 20){
                System.out.println("DEBUG!!");
            }
            Executor_Fixed numberPrint = new Executor_Fixed(i);
            es.submit(numberPrint);
        }
        es.shutdown();

    }
}
