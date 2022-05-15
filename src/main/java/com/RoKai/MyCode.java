package com.RoKai;

import java.util.Scanner;

public class MyCode {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入: ");
        while (true){
            int i = scanner.nextInt();
            if (i == 1){
                System.out.println("Java");
                break;
            }else if (i == 2){
                System.out.println("MySql");
                break;
            }else if (i != 1 && i != 2){
                System.out.println("输入的数字无效！");
                System.out.print("请输入: ");
            }
        }
    }

}
