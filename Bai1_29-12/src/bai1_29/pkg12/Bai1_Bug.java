package bai1_29.pkg12;

import java.util.Scanner;

//Đã vượt qua 2 testcase của đề [2, 3, 1, 1, 4], [3, 2, 1, 0, 4]
public class Bai1_Bug {

    public static void main(String[] args) {
        int a[] = new int[100];
        int n = 5;
        inputArray(a, n);
        checkArray(a, n);
    }
    
    public static void inputArray(int a[], int n){
        Scanner input = new Scanner(System.in);
        System.out.println("Mời bạn nhập " + n + " phần tử mảng");
        for (int i = 0; i < n; i++){
            int number = input.nextInt();
            a[i] = number;
        }
    }
    
    public static void checkArray(int a[], int n){
        int i = 0;
        while(i < n){
            if (a[i] == 0){
                break;
            }
            i += a[i];
        }
        if (i - a[n-1] + 1 == n){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
