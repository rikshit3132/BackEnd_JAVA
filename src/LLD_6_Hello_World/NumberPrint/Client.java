package LLD_6_Hello_World.NumberPrint;

public class Client {
    static void main(String[] args) {
        for(int i = 0; i < 100; i++){
            NumberPrinter nm = new NumberPrinter(i);
            Thread t1 = new Thread(nm);
            t1.start();

        }
    }
}
