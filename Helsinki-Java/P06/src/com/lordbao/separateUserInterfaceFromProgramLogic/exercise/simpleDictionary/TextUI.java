package com.lordbao.separateUserInterfaceFromProgramLogic.exercise.simpleDictionary;

import java.util.Scanner;

/**
 * @Author Lord_Bao
 * @Date 2024/5/8 20:48
 * @Version 1.0
 */
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    private void add(){
        System.out.print("Word: ");
        String word = scanner.nextLine();
        System.out.print("Translation: ");
        String translation = scanner.nextLine();
        dictionary.add(word,translation);
    }

    private void search(){
        System.out.print("To be translated: ");
        String word = scanner.nextLine();
        String translation = dictionary.translate(word);
        if(translation==null){
            System.out.println("Word "+word +" was not found");
        }else {
            System.out.println("Translation: "+translation);
        }
    }

    public void  start(){
        while (true){
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if(Command.end.equals(command)){
                break;
            }else if(Command.add.equals(command)){
                add();
            }else if(Command.search.equals(command)){
                search();
            } else {
                System.out.println("Unknown command");
            }
        }
        System.out.println("Bye bye!");
    }
}
