package design_patterns.strategy;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[] {9,8,7,6,5,4,3,2,1};
        Sort sort = new Sort(new QuickSort());
        int[] res = sort.executeSort(nums);
        for (int i=0; i<res.length; i++) {
            System.out.println(res[i]);

        }



    }
}
