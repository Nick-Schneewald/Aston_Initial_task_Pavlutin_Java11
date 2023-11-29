package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter number: ");
        int num = Integer.valueOf(br.readLine());
        printHiIfMoreThanSevenGiven(num);

        System.out.print("Enter string: ");
        String str = br.readLine();
        printGreetingIfNameIsLegal(str);

        System.out.print("Enter array length: ");
        int len = Integer.valueOf(br.readLine());
        if (len > 0) {
            System.out.println("Enter elements: ");
            int[] arr = new int[len];
            for(int i = 0; i < len; i++) {
                arr[i] = Integer.valueOf(br.readLine());
        }
        printMultiplesOfThree(arr);
        }
    }

    public static void printHiIfMoreThanSevenGiven(int number){
        if (number > 7) {System.out.println("Привет");}
    }

    public static void printGreetingIfNameIsLegal(String name){
        if (name.equals("Вячеслав")) {
                System.out.println("Привет, Вячеслав");}
            else {
                System.out.println("Нет такого имени");}
    }

    public static void printMultiplesOfThree(int[] inputArr){
        int[] temp = new int[inputArr.length];
        for(int i = 0; i < inputArr.length; i++) {
            if(inputArr[i] % 3 == 0)
                System.out.print(inputArr[i] + " ");
        }
        System.out.println();
    }
}