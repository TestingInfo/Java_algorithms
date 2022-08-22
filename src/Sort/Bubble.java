package Sort;
import java.util.Arrays;

public class Bubble {

    // 1. Задача: Остортировать массив методом пузырька

    public static void main(String[] args) {

        int [] arr = {10,9,8,7,6,5,4,3,2,1};

        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    isSorted = false;
                }
            }System.out.println("Массив отсортирован: " + Arrays.toString(arr));
        }
    }
}
