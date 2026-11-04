package LLD_7.mixed_call_run;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newFixedThreadPool(3);
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for(int i = 1; i <= 100; i++){
            if(i == 10 || i == 15 || i == 25){
                System.out.println("DEBUG!!");
            }
            FixedThreadPool request = new FixedThreadPool(i);
           executorService.execute(request);
        }
        executorService.shutdown();
    }
}
