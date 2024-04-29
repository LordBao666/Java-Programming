package com.lordbao.FilesAndReadData.note;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * @Author Lord_Bao
 * @Date 2024/4/29 11:16
 * @Version 1.0
 *
 * If you don't know how the following code works,please take a look at TestCurrentWorkingDirectory.java
 */
public class ReadAFileByCurrentWorkingDirectory {
    public static void main(String[] args) throws IOException {
        //try-with-resources
        //remember that Java.io package resolve relative pathnames using current user directory
        try(Scanner sc = new Scanner(Path.of("Helsinki-Java/P04/resources/file.txt"))){
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
    }
}
