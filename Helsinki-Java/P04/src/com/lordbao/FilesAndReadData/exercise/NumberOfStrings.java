package com.lordbao.FilesAndReadData.exercise;

import java.util.Scanner;

/**
 * @Author Lord_Bao
 * @Date 2024/4/28 20:16
 * @Version 1.0
 *
 * Write a program that reads strings from the user until the user inputs the string "end".
 * At that point, the program should print how many strings have been read.
 * The string "end" should not be included in the number strings read.
 * You can find some examples below of how the program works.
 * input:
 * I
 * have
 * a
 * feeling
 * that
 * I
 * have
 * written
 * this
 * wrong
 * before
 * end
 *
 * output:
 * 11
 */
public class NumberOfStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count=0;//record num of strings
        while (true){
            String line = sc.nextLine();
            if(line.equals("end")){
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}
