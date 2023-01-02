package bai1_29.pkg12;

import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.printf("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n < 0);
        int array[] = new int[n];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println(canJump(array));
    }

    public static boolean canJump(int array[]) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (i > max) {
                return false;
            }
            max = Math.max(max, i + array[i]);
        }
        return true;
    }
}
