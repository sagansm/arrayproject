package me.ssagan.arrayapp._main;

import me.ssagan.arrayapp.model.util.ArrayDescription;

public class _Main {

    public static void main(String[] args) {
        ArrayDescription arrayDescription = new ArrayDescription();

        /*int[] someArray = {(int) (Math.random() * 10),
                           (int) (Math.random() * 10),
                           (int) (Math.random() * 10),
                           (int) (Math.random() * 10),
                           (int) (Math.random() * 10),
                           (int) (Math.random() * 10),
                           (int) (Math.random() * 10),
                           (int) (Math.random() * 10),
                           (int) (Math.random() * 10),
                           (int) (Math.random() * 10)};*/

        int[] someArray = new int[]{5, -3, 2, 1, 7, 11, 12, -4, 1, 10};
        System.out.print("массив: ");
        for (int i : someArray) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("1. количество четных чисел в массиве: " + arrayDescription.countEven(someArray));
        System.out.println("2. количество нечетных чисел в массиве: " + arrayDescription.countOdd(someArray));
        System.out.println("3. количество простых чисел в массиве: " + arrayDescription.countSimple(someArray));
        System.out.println("4. сумма всех чисел в массиве: " + arrayDescription.sum(someArray));
        System.out.println("5. разность между суммой чисел имеющих четный индекс и суммой чисел имеющих нечетный индекс в массиве: " +
                arrayDescription.differenceEvenIndexSumAndOddIndexSum(someArray));
        System.out.println("6. количество нулей в массиве: " + arrayDescription.countZero(someArray));
    }
}
