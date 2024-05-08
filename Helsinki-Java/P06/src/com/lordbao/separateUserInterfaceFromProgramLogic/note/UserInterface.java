package com.lordbao.separateUserInterfaceFromProgramLogic.note;

import java.util.Scanner;

/**
 * @Author Lord_Bao
 * @Date 2024/5/8 19:57
 * @Version 1.0
 */
public class UserInterface {
    private WordSet wordSet;
    private Scanner scanner;
    public UserInterface(WordSet wordSet,Scanner scanner) {
        this.wordSet=wordSet;
        this.scanner=scanner;
    }

    public void start(){
        while (true){
            System.out.print("Enter a word:");
            String word = scanner.nextLine();

            if(wordSet.contains(word)){
                break;
            }

            wordSet.add(word);
        }
        System.out.println("You have written this word twice");
        System.out.println(wordSet.palindromes() +" of the words are palindromes" );
    }
}
