package com.lordbao.FilesAndReadData.note;

import java.net.URL;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * @Author Lord_Bao
 * @Date 2024/4/29 15:06
 * @Version 1.0
 *
 * The  class comes with data.txt
 */
public class ReadASpecialFormatFile {
    public static void main(String[] args) {
        System.out.println("Enter your file name:");
        Scanner scanner  =  new Scanner(System.in);
        String file = scanner.nextLine();
        URL resource = ReadAFileByClassPath.class.getResource("/" + file);
        try(Scanner sc = new Scanner(Path.of(resource.toURI()))) {
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                String[] arr = line.split(",");
                String name =arr[0];
                int age = Integer.parseInt(arr[1]);
                System.out.println("name: "+ name +",age: "+age);
            }
        } catch (Exception e) {
            System.out.println("Sorry,"+file+" dose NOT exist");
        }
    }
}
