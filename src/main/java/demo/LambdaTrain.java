package demo;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LambdaTrain {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,4,5};
        int[] nums2 = new int[]{4,5,6,7,8};
        PriorityQueue<int[]> quene = new PriorityQueue<>(Comparator.comparingInt(a -> nums1[a[0]] + nums2[a[1]]));
        System.out.println(quene.isEmpty());
    }
}
