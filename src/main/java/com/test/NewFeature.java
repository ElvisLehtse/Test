package com.test;

import java.util.Scanner;

public class NewFeature {

    public void calculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number");
        int i = scanner.nextInt();
        System.out.println("Type another number");
        int j = scanner.nextInt();
        System.out.println("sum is: " + i + j);
    }
}
