package com.lordbao.FilesAndReadData.note;

import java.nio.file.Path;

/**
 * @Author Lord_Bao
 * @Date 2024/4/29 11:05
 * @Version 1.0
 *
 *  Check this: https://stackoverflow.com/questions/4871051/how-to-get-the-current-working-directory-in-java
 *  User Working Directory is the place where your application is initialized,and you can get it by
 *  System.getProperty("user.dir").
 *  Java.io package resolve relative pathnames using current user directory
 */
public class TestCurrentWorkingDirectory {
    public static void main(String[] args) {
        System.out.println("Current Working Directory: "+System.getProperty("user.dir")); //In my case,it is D:\workspace\java\Java-Programming
        Path absolutePath = Path.of("./").toAbsolutePath();// In my case,it is D:\workspace\java\Java-Programming\.
        System.out.println(absolutePath);
        Path absolutePath1 = Path.of("/").toAbsolutePath();// In my case,it is D:\
        System.out.println(absolutePath1);
    }
}
