package LLD_8_Callables.Adder_and_Subtractor;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter(0);
        Adder adder = new Adder(counter);
        Subtractor subtractor = new Subtractor(counter);
        Thread adderThread = new Thread(adder);
        Thread subtractorThread = new Thread(subtractor);
        adderThread.start();

        adderThread.join();

        subtractorThread.start();
        subtractorThread.join();
        System.out.println("Counter Value is:  "+ counter.getValue());
    }
}
