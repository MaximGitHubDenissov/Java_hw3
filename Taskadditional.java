package Java_hw_3;
// (Дополнительное) Реализовать алгоритм сортировки слиянием
import java.util.Arrays;

public class Taskadditional {
    public static void main(String[] args) {

        int[] array = new int[] { 8, 5, 3, 4, 2, 18, 7, 1};
        PrintArr(mergeSort(array));   
               
    }

    public static int[] mergeSort(int[] arr) {
        if (arr.length <= 1)
            return arr;
        int[] left = Arrays.copyOfRange(arr, 0, arr.length / 2);
        int[] right = Arrays.copyOfRange(arr, left.length, arr.length);
        return merge(mergeSort(left), mergeSort(right));
    }

    public static int[] merge(int[] left, int[] right) {
        int resIdx = 0;
        int leftIdx = 0;
        int rightIdx = 0;
        int[] result = new int[left.length + right.length];

        while (leftIdx < left.length && rightIdx < right.length)
            if (left[leftIdx] < right[rightIdx])
                result[resIdx++] = left[leftIdx++];
            else
                result[resIdx++] = right[rightIdx++];

        while (resIdx < result.length)
            if (leftIdx != left.length)
                result[resIdx++] = left[leftIdx++];
            else
                result[resIdx++] = right[rightIdx++];

        return result;
    }

    static void PrintArr(int[] arr) {
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            result += String.valueOf(arr[i]) + " ";
        }
        System.out.println(result);
    }
}
