package com.epam.rd.autotasks;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] arrayOfNumb = new int[100];
        int i;
        int arrLen = 0;
        for (i = 0; i < 100; i++) {
            arrayOfNumb[i] = scan.nextInt();
            if (arrayOfNumb[i] == 0) {
                arrLen = i;
                break;
            }
        }
        int average = 0;
        int sum = 0;
        for (i = 0; i < arrLen; i++) {
            if (arrayOfNumb[i] == 0) {
                break;
            }
            sum+= arrayOfNumb[i];


        }
        average = sum/arrLen;
        System.out.println(average);

    }

}