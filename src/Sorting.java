import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {

    public static double[] bucketSort(double[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr;
        }

        int n = arr.length;
        List<List<Double>> buckets = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            buckets.add(new ArrayList<>());
        }

        for (double val : arr) {
            int bucketIndex = (int) (val * n);
            if (bucketIndex >= n) {
                bucketIndex = n - 1;
            }
            buckets.get(bucketIndex).add(val);
        }

        double[] result = new double[n];
        int idx = 0;
        for (List<Double> bucket : buckets) {
            Collections.sort(bucket);
            for (double val : bucket) {
                result[idx++] = val;
            }
        }

        return result;
    }

    public static int[] radixSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr;
        }

        int[] result = arr.clone();

        int max = result[0];
        for (int val : result) {
            if (val > max) {
                max = val;
            }
        }

        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSortByDigit(result, exp);
        }

        return result;
    }

    private static void countingSortByDigit(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];

        for (int val : arr) {
            int digit = (val / exp) % 10;
            count[digit]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr[i] / exp) % 10;
            output[--count[digit]] = arr[i];
        }

        System.arraycopy(output, 0, arr, 0, n);
    }

    public static int[] countingSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr;
        }

        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[4];

        for (int val : arr) {
            count[val]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            int val = arr[i];
            output[--count[val]] = val;
        }

        return output;
    }
}
