package striver_sde_sheet.Arrays_II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Merge_Overlapping_SubIntervals {
    // public static int[][] merge(int[][] intervals) { // brute
    //     if (intervals == null || intervals.length == 0) return new int[0][0];
        
    //     Arrays.sort(intervals, new Comparator<int[]>() {
    //         public int compare(int[] a, int[] b) {
    //             return a[0] - b[0];
    //         }
    //     });

    //     List<int[]> merged = new ArrayList<>();
        
    //     int start = intervals[0][0];
    //     int end = intervals[0][1];

    //     for (int i = 1; i < intervals.length; i++) {
    //         int currStart = intervals[i][0];
    //         int currEnd = intervals[i][1];

    //         if (currStart <= end) {
    //             // Overlapping intervals, merge them
    //             end = Math.max(end, currEnd);
    //         } else {
    //             // No overlap, add the previous interval and reset
    //             merged.add(new int[]{start, end});
    //             start = currStart;
    //             end = currEnd;
    //         }
    //     }
    //     // Add the last interval
    //     merged.add(new int[]{start, end});

    //     return merged.toArray(new int[merged.size()][]);
    // }
    public static int[][] merge(int[][] intervals) { // optimal
        if (intervals == null || intervals.length == 0) return new int[0][0];

        // Sort intervals by start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();
        int[] last = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            int[] curr = intervals[i];
            if (curr[0] <= last[1]) {
                // Merge intervals
                last[1] = Math.max(last[1], curr[1]);
            } else {
                merged.add(last);
                last = curr;
            }
        }
        merged.add(last);

        return merged.toArray(new int[merged.size()][]);
    }
       public static void main(String[] args) { 
        int[][] intervals = {
            {1, 3},
            {2, 6},
            {8, 10},
            {15, 18}
        };
        int[][] merged = merge(intervals);

        for (int[] interval : merged) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }
        // Expected output:
        // [1, 6]
        // [8, 10]
        // [15, 18]
    }
}
