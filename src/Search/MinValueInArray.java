package Search;

public class MinValueInArray {
    //  1 Задача (Нахождение минимального числа в массиве)
    //  Создать массив и чисел
    //  Найти наименьшее число в массиве, а так же найти индекс этого числа
    //  Результат вывести в консоль
    public static void main(String[] args) {
        // 1
        int[] arr = {89,6,9,8,90,56,100,23,345,46,568,5,345};
        int minValue = arr[0];
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < minValue){
                minValue = arr[i];
                minIndex = i;
            }
        }
        System.out.println("Минимальное число в массиве: " + minValue);
        System.out.println("Индекс минимального числа в массиве: " + minIndex);
    }
}
