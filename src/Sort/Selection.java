package Sort;

import java.util.Arrays;

// Задача: Отсортировать массив выбором
public class Selection {
    public static void main(String[] args) {

        int[] arr = {1,2,3,5,76,78,9,333,65,0};

        for (int step = 0; step < arr.length; step++) {
            int index = min(arr, step);
            int tmp = arr[step];
            arr[step] = arr[index];
            arr[index] = tmp;
        }
        System.out.println(Arrays.toString(arr));
    }

        private static int min(int[] arr, int start) {
            int minValue = arr[start];
            int minIndex = start;
            for (int i = start + 1; i < arr.length; i++) {
                if(arr[i] < minValue){
                    minValue = arr[i];
                    minIndex = i;
                }
            }
            return minIndex;
        }
    }


