package me.ssagan.arrayapp.model.util;

public class ArrayDescription {

    //количество четных чисел в массиве
    public int countEven(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    //количество нечетных чисел в массиве
    public int countOdd(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    //является ли число простым
    private boolean isSimple(int n) {
        if (Math.abs(n) == 1) {
            return true;
        }
        for (int i = 2; i < Math.abs(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //количество простых чисел в массиве
    public int countSimple(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isSimple(arr[i])) {
                count++;
            }
        }
        return count;
    }

    //сумму всех чисел в массиве
    public int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    //разность между суммой чисел имеющих четный индекс и суммой чисел имеющих нечетный индекс в массиве
    public int differenceEvenIndexSumAndOddIndexSum(int[] arr) {
        int evenIndexSum = 0;
        int oddIndexSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                evenIndexSum = evenIndexSum + arr[i];
            } else {
                oddIndexSum = oddIndexSum + arr[i];
            }

        }
        return evenIndexSum - oddIndexSum;
    }

    //количество 0 (сколько раз встречается число "0") в массиве
    public int countZero(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        return count;
    }
}
