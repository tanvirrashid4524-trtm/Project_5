package Task3;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int subjects = sc.nextInt();
        int students = sc.nextInt();

        int[][] grades = new int[students][subjects];
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < subjects; j++) {
                grades[i][j] = sc.nextInt();
            }
        }

        double[] averages = new double[students];
        double totalSum = 0;

        for (int i = 0; i < students; i++) {
            int sum = 0;
            for (int j = 0; j < subjects; j++) {
                sum += grades[i][j];
            }
            averages[i] = (double) sum / subjects;
            totalSum += sum;
        }

        double groupAverage = totalSum / (students * subjects);

        // 1. Student averages
        System.out.println("Student averages:");
        for (int i = 0; i < students; i++) {
            printAverage(averages[i]);
        }

        // 2. Group average
        System.out.println();
        System.out.println("Group average:");
        printAverage(groupAverage);

        // 3. Highest-performing student(s)
        System.out.println();
        System.out.println("Highest-performing student:");
        double highest = averages[0];
        for (int i = 1; i < students; i++) {
            if (averages[i] > highest) {
                highest = averages[i];
            }
        }
        for (int i = 0; i < students; i++) {
            if (averages[i] == highest) {
                System.out.println(i + 1);
            }
        }

        // 4. Students with at least one grade below 5
        System.out.println();
        System.out.println("Students with at least one grade below 5:");
        boolean found = false;
        for (int i = 0; i < students; i++) {
            boolean hasBelow5 = false;
            for (int j = 0; j < subjects; j++) {
                if (grades[i][j] < 5) {
                    hasBelow5 = true;
                    break;
                }
            }
            if (hasBelow5) {
                System.out.println(i + 1);
                found = true;
            }
        }
        if (!found) {
            System.out.println("None");
        }
    }

    // 8.0 hole 8 print korbe, 8.75 hole 8.75 print korbe
    private static void printAverage(double avg) {
        if (avg == (int) avg) {
            System.out.println((int) avg);
        } else {
            System.out.println(avg);
        }
    }
}