package com.ramka.example;

import java.util.Scanner;

public class Ramka {
    public static void main(String[] args) {
        int length;
        Scanner in = new Scanner(System.in);
        System.out.print("Место учебы: ");
        String work = in.nextLine();
        length = work.length();
        System.out.print("Что изучаете: ");
        String group = in.nextLine();
        if(length < group.length()) length = group.length();
        System.out.print("Как ваше имя: ");
        String name = in.nextLine();
        if(length < name.length()) length = name.length();
        length = length + 4;
        paintRamka(work, group, name, length);
    }

    public static void paintRamka(String work, String group, String name, int length){
        printFrame(length);
        System.out.print("* " + name);
        printSpaces(length - name.length());
        System.out.print("* " + group);
        printSpaces(length - group.length());
        System.out.print("* " + work);
        printSpaces(length - work.length());
        printFrame(length);
    }

    public static void printSpaces(int length){
        for (int i = 0; i < length - 3; i++) {
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.println();
    }

    public static void printFrame(int length){
        for (int i = 0; i < length; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
