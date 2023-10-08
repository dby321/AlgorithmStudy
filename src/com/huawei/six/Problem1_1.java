package com.huawei.six;

import java.util.Scanner;

/**
 * @author dongbinyu
 * @version 1.0
 * @project AlgorithmStudy
 * @description
 * @date 2023/9/26 15:51:08
 */
public class Problem1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long totalNumbers = scanner.nextLong();
        long divisor = scanner.nextLong();

        long[] numbers = new long[(int) totalNumbers];
        for (int i = 0; i < totalNumbers; i++) {
            numbers[i] = scanner.nextLong();
        }

        long totalOperations = 0;
        long remainder = 0;

        for (int i = 0; i < totalNumbers; i++) {
            long currentSum = numbers[i] + remainder;
            long divisionResult = currentSum / divisor;
            long newRemainder = currentSum % divisor;
            if (divisionResult == 0 && remainder != 0) {
                divisionResult++;
                newRemainder = 0;
            }

            totalOperations += divisionResult;
            remainder = newRemainder;
        }

        if (remainder != 0) {
            totalOperations++;
        }

        System.out.println(totalOperations);
    }


}
