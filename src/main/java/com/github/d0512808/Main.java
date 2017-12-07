package com.github.d0512808;

import java.util.Scanner;
public class Main {
    public int add(int a, int b) {
        return a + b;
    }
    public void main (String arge[]){
        Scanner keyboard = new Scanner(System.in);
        int a=keyboard.nextInt();

        if (a==0){
            System.out.print("a是0");
        }
        else{
            System.out.print("a不是0");
        }
    }
}
