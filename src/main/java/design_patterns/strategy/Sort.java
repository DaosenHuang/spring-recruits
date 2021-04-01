package design_patterns.strategy;

/**
 * 策略模式
 */
public class Sort {
    private final SortStrategy sortStrategy;
    public Sort(SortStrategy s) {
        this.sortStrategy = s;
    }

    public int[] executeSort(int[] nums) {
        return sortStrategy.sort(nums);
    }
}
