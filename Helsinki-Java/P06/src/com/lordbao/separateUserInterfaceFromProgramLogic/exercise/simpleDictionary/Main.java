package com.lordbao.separateUserInterfaceFromProgramLogic.exercise.simpleDictionary;

import java.util.Scanner;

/**
 * @Author Lord_Bao
 * @Date 2024/5/8 20:46
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDictionary dictionary = new SimpleDictionary();

        TextUI textUI = new TextUI(scanner, dictionary);
        textUI.start();
    }
}