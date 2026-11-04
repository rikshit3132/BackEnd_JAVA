package LLD_7.operations_Extra;

import java.util.concurrent.*;

public class Demo {
    public static void main(String[] args) throws Exception {
        System.out.println("Starting the services!!");
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Callable<Double> getMarks = (() -> {
            System.out.println(" Marks Thread: "+Thread.currentThread().getName());
            Thread.sleep(2000);
           return 40.5;
        });
        Callable<Integer> getPsp = (() ->{
            System.out.println(" psp Thread: "+Thread.currentThread().getName());

            Thread.sleep(8000);
            return 80;
        });
        Callable<String> getName = (() -> {
            System.out.println(" Name Thread: "+Thread.currentThread().getName());

            Thread.sleep(3500);
            return "Rahul Rana";
        });
        Future<Double> futureMarks = executorService.submit(getMarks);


        Future<Integer> futurePsp = executorService.submit(getPsp);

        Future<String> futureName = executorService.submit(getName);
        double marks = 0.0;
        try {
            marks = futureMarks.get(3,TimeUnit.SECONDS);
        }catch (TimeoutException e){
            System.out.println("Task took too long");
        }
        String name = futureName.get();
        int psp  = futurePsp.get();


        System.out.println("Before Get functions");


            Thread.sleep(3000);

        System.out.println("Name: "+name +" "+"Psp: "+psp+" "+"Marks: "+marks);

        executorService.shutdown();
    }
}
