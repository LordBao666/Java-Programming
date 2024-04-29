package com.lordbao.FilesAndReadData.note;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * @Author Lord_Bao
 * @Date 2024/4/29 11:53
 * @Version 1.0
 *
 * If you don't know how the following code works,please take a look at TestGetResource.java
 */
public class ReadAFileByClassPath {
    public static void main(String[] args) throws URISyntaxException, IOException {
//        URL resource = ReadAFileByClassPath.class.getResource("/file.txt");
//        File file = new File(resource.toURI());
//        try(Scanner sc = new Scanner(file)) {
//            while (sc.hasNextLine()){
//                System.out.println(sc.nextLine());
//            }
//        }

//      The code works the same as the above one
        URL resource = ReadAFileByClassPath.class.getResource("/file.txt");
        try(Scanner sc = new Scanner(Path.of(resource.toURI()))) {
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
    }
}
