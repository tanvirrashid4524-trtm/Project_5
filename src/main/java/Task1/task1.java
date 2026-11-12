package Task1;

import java.util.Scanner;

public class task1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int largest = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int radius = sc.nextInt();

            if (radius > largest) {
                largest = radius;
                count = 1;
            } else if (radius == largest) {
                count++;
            }
        }

        System.out.println(largest + " - " + count);
    }
}