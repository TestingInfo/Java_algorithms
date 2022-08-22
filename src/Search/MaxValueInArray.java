package Search;

public class MaxValueInArray {

    //  1 Задача (Нахождение максимального числа в массиве)
    //  Создать массив и чисел
    //  Найти наибольшее число в массиве, а так же найти индекс этого числа
    //  Результат вывести в консоль

    public static void main(String[] args){

        int[] arr = {2,23,234,2,34,23,4,25,245,65,6,};

        int maxValue = arr[0];
        int indexValue = 0;

        for (int i = 1; i < arr.length; i++) {
            if(maxValue < arr[i]) {
                maxValue = arr[i];
                indexValue = i;
            }
        }
        System.out.println("Самое большое число в массиве: " + maxValue);
        System.out.println("Индекс числа в массиве: " + indexValue);
    }
}
