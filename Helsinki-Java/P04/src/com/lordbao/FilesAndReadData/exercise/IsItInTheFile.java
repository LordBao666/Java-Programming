package com.lordbao.FilesAndReadData.exercise;



import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * @Author Lord_Bao
 * @Date 2024/4/29 14:33
 * @Version 1.0
 *
 *The exercise template comes with two files, names.txt and other-names.txt.
 *Write a program that first asks the user for the name of the file to be read,
 *after which the user is prompted for the string that they're looking for.
 *The program then reads the file and searches for the desired string.
 *
 * If the string is found, the program should print "Found!".
 * If not, the program should print "Not found.".
 * If reading the file fails (the reading ends in an error) the program should print the message "Reading the file " + file + " failed.".
 *
 *
 * output:   Name of the file:
 * input:    names.txt
 * output:   Search for:
 * input:    Antti
 * output:   Not found.
 *
 *
 * output:   Name of the file:
 * input:    names.txt
 * output:   Search for:
 * input:    ada
 * output:   Found!
 *
 * output:   Name of the file:
 * input:    nonexistent.txt
 * output:   Search for:
 * input:    test
 * output:   Reading the file nonexistent.txt failed.
 */

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        URL resource = IsItInTheFile.class.getResource("/" + file);
        try(Scanner sc = new Scanner(Path.of(resource.toURI()))){
            while(sc.hasNextLine()){
                String line =sc.nextLine();
                if(line.equals(searchedFor)){
                    System.out.println("Found!");
                    return;
                }
            }
            System.out.println("Not Found.");
        }catch (Exception ex){
            System.out.println("Reading the file " + file + " failed.");
        }

    }
}

