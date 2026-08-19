package LLD_8_Callables;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class MergeSorter implements Callable<List<Integer>> {
    private List<Integer> arr;
    MergeSorter(List<Integer> arr){
        this.arr = arr;
    }

    @Override
    public List<Integer> call() throws Exception{
        int mid = arr.size()/2;
        List<Integer> left = new ArrayList<Integer>();
        List<Integer> right = new ArrayList<Integer>();
        for(int i = 0; i < mid; i++){
            left.add(arr.get(i));
        }
        for(int i = mid; i < arr.size(); i++){
            right.add(arr.get(i));
        }
       MergeSorter leftArray =  new MergeSorter((left));
       MergeSorter rightArray =  new MergeSorter((right));

       List<Integer> leftSortedArray =  leftArray.call();
        List<Integer> rightSortedArray =  rightArray.call();
        return merge(leftSortedArray,rightSortedArray);
    }
    private List<Integer> merge(List<Integer> leftSortedArray,List<Integer> rightSortedArray){
        int i = 0;
        int j = 0;
        List<Integer> ans = new ArrayList<>();
        while (i <= leftSortedArray.size() && j <= rightSortedArray.size()){
            if(leftSortedArray.get(i) <= rightSortedArray.get(j)){
                ans.add(leftSortedArray.get(i));
            }else{
                ans.add(rightSortedArray.get(j));
            }
        }
        while (i <= leftSortedArray.size()){
            ans.add(leftSortedArray.get(i));
        }
        while(j < rightSortedArray.size()){
            ans.add(rightSortedArray.get(j));
        }
        return ans;
    }

}
