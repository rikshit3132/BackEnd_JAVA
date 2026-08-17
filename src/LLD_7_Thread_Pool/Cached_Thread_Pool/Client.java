package LLD_7_Thread_Pool.Cached_Thread_Pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    static void main() {
        ExecutorService es = Executors.newCachedThreadPool();
        for (int i = 1; i <= 100 ; i++) {

            CacheExecutor numberPrint = new CacheExecutor(i);
            es.submit(numberPrint);
        }
        es.shutdown();

    }
}
