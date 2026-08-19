package LLD_8_Callables;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Integer> data = List.of(2,4,6,4,76,7,9,1);
        MergeSorter mergeSorter = new MergeSorter(data);
    }
}
