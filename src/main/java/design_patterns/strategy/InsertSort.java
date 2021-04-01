package design_patterns.strategy;

/**
 * 插入排序
 */
public class InsertSort implements SortStrategy {
    public int[] sort(int[] nums) {
        for (int i=1; i<nums.length; i++) {
            int cur=nums[i];
            for (int p=i-1; p>=0; p--) {
                if (cur < nums[p]) {
                    nums[p+1] = nums[p];
                    continue;
                }
                nums[p+1] = cur;
                break;
            }

        }
        return nums;
    }

}
