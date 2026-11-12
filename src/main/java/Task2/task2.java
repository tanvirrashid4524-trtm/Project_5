package Task2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] residents = new int[n];
        for (int i = 0; i < n; i++) {
            residents[i] = sc.nextInt();
        }

        int total = 0;
        int leftSum = 0;
        int rightSum = 0;
        int leftCount = 0;
        int rightCount = 0;

        // house number = i + 1, karon array 0 theke suru
        for (int i = 0; i < n; i++) {
            total += residents[i];

            int houseNumber = i + 1;
            if (houseNumber % 2 == 1) {
                // odd = left
                leftSum += residents[i];
                leftCount++;
            } else {
                // even = right
                rightSum += residents[i];
                rightCount++;
            }
        }

        System.out.println("Total residents: " + total);
        System.out.println("Residents on the left: " + leftSum);
        System.out.println("Residents on the right: " + rightSum);

        if (leftCount == 0) {
            System.out.println("Average per house on the left: N/A");
        } else {
            double avgLeft = (double) leftSum / leftCount;
            if (avgLeft == (int) avgLeft) {
                System.out.println("Average per house on the left: " + (int) avgLeft);
            } else {
                System.out.println("Average per house on the left: " + avgLeft);
            }
        }

        if (rightCount == 0) {
            System.out.println("Average per house on the right: N/A");
        } else {
            double avgRight = (double) rightSum / rightCount;
            if (avgRight == (int) avgRight) {
                System.out.println("Average per house on the right: " + (int) avgRight);
            } else {
                System.out.println("Average per house on the right: " + avgRight);
            }
        }
    }
}