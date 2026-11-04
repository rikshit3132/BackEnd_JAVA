package LLD_6.NumberPrint;

public class NumberPrinter implements Runnable {
    private int number;
    NumberPrinter(int number){
        this.number = number;
    }
    @Override
    public void run(){
        System.out.println("Iam number: "+number+" Iam thread: "+Thread.currentThread().getName());
    }
}
