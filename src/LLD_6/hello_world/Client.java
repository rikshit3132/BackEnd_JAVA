package LLD_6.hello_world;

public class Client {
    static void main(String[] args) {
        HelloWorldPrint h = new HelloWorldPrint();
        Thread t1 = new Thread(h);
        t1.start();
    }
}
