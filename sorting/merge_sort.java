package sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class merge_sort {
    public static void merge(int[] arr, int low, int mid, int high) {
        List<Integer> merged = new ArrayList<>();
        int left = low, right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                merged.add(arr[left++]);
            } else {
                merged.add(arr[right++]);
            }
        }

        while (left <= mid) merged.add(arr[left++]);
        while (right <= high) merged.add(arr[right++]);

        for (int i = low; i <= high; i++) {
            arr[i] = merged.get(i - low);
        }
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        mergeSort(arr, 0, n - 1);

        for (int x : arr) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}
