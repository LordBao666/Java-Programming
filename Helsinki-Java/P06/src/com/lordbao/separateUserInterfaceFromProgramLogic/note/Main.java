package com.lordbao.separateUserInterfaceFromProgramLogic.note;

import java.util.Scanner;

/**
 * @Author Lord_Bao
 * @Date 2024/5/8 20:22
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WordSet ws = new WordSet();
        UserInterface ui = new UserInterface(ws,sc);
        ui.start();
    }
}
