package design_patterns.strategy;

public class QuickSort implements SortStrategy {
    public int[] sort(int[] nums) {

        sort(nums, 0, nums.length-1);
        return nums;
    }

    private void sort(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        int pivot = nums[start];
        int left=start, right=end;

        while (left < right) {
            while (left < right && nums[right] >= pivot) {
                right--;
            }
            nums[left] = nums[right];
            while (left < right && nums[left] < pivot) {
                left++;
            }
            nums[right] = nums[left];
        }
        nums[right] = pivot;
        sort(nums, start, right);
        sort(nums, right+1, end);

    }
}
