package JIQ;

import java.util.Collections;
import java.util.PriorityQueue;

public class KsmallestAndLargest {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 3;

        System.out.println("Kth Smallest: " + findKthSmallest(arr, k));
        System.out.println("Kth Largest: " + findKthLargest(arr, k));
    }

    public static Integer findKthSmallest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : nums) {
            maxHeap.add(num);
            if (maxHeap.size() > k) {
                maxHeap.poll(); // remove largest to keep smallest
            }
        }

        return maxHeap.peek();
    }

    public static Integer findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll(); // remove smallest to keep largest
            }
        }

        return minHeap.peek();
    }
}
