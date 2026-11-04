package LLD_8_Callables.Adder_and_Subtractor;

public class Subtractor implements Runnable{
    private Counter counter;
    Subtractor(Counter counter){
        this.counter = counter;
    }
    @Override
    public void run(){
        for (int i = 1; i <= 100; i++){
            counter.setValue(counter.getValue() - i);
        }
    }
}
