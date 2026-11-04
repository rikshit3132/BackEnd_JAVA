package LLD_8_Callables;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>> {
    private List<Integer> arr;
    private ExecutorService executorService;
    MergeSorter(List<Integer> arr,ExecutorService executorService){
        this.arr = arr;
        this.executorService = executorService;
    }

    @Override
    public List<Integer> call() throws Exception{
//         2,4,6,4,76,7,9,1
//        2,4,6,4   // 76,7,9,1
        if(arr.size() <= 1){
            return arr;
        }
        int mid = arr.size()/2;
        List<Integer> left = new ArrayList<Integer>();
        List<Integer> right = new ArrayList<Integer>();
        for(int i = 0; i < mid; i++){
            left.add(arr.get(i));
        }
        for(int i = mid; i < arr.size(); i++){
            right.add(arr.get(i));
        }
       MergeSorter leftArray =  new MergeSorter(left,executorService);
       MergeSorter rightArray =  new MergeSorter(right,executorService);


       Future<List<Integer>> leftSortedArray =  executorService.submit(leftArray);
       Future<List<Integer>> rightSortedArray = executorService.submit(rightArray);

       List<Integer> leftSortedData = leftSortedArray.get();
       List<Integer> rightSortedData = rightSortedArray.get();

//       executorService.shutdown();


//       List<Integer> leftSortedArray =  leftArray.call();
//        List<Integer> rightSortedArray =  rightArray.call();
        return merge(leftSortedData,rightSortedData);
    }
    private List<Integer> merge(List<Integer> leftSortedArray,List<Integer> rightSortedArray){
        int i = 0;
        int j = 0;
        List<Integer> ans = new ArrayList<>();
        while (i < leftSortedArray.size() && j < rightSortedArray.size()){
            if(leftSortedArray.get(i) <= rightSortedArray.get(j)){
                ans.add(leftSortedArray.get(i));
                i++;
            }else{
                ans.add(rightSortedArray.get(j));
                j++;
            }
        }
        while (i < leftSortedArray.size()){
            ans.add(leftSortedArray.get(i));
            i++;
        }
        while(j < rightSortedArray.size()){
            ans.add(rightSortedArray.get(j));
            j++;
        }
        return ans;
    }

}
