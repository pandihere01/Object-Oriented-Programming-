import java.util.Arrays;

public class FindMedian {
    public double findMedian(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if (n % 2 == 0) {
            // Even number of elements
            int mid1 = nums[n / 2 - 1];
            int mid2 = nums[n / 2];
            return (double) (mid1 + mid2) / 2;
        } else {
            // Odd number of elements
            return nums[n / 2];
        }
    }

    public static void main(String[] args) {
        FindMedian finder = new FindMedian();
        int[] nums1 = {1, 2, 3, 4, 5};
        System.out.println("Median of nums1: " + finder.findMedian(nums1)); // Output: 3.0
        
        int[] nums2 = {1, 2, 3, 4, 5, 6};
        System.out.println("Median of nums2: " + finder.findMedian(nums2)); // Output: 3.5
    }
}
