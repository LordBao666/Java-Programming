package com.lordbao.FilesAndReadData.note;

import java.net.URL;

/**
 * @Author Lord_Bao
 * @Date 2024/4/29 13:31
 * @Version 1.0
 *
 * Check this:
 * https://stackoverflow.com/questions/6608795/what-is-the-difference-between-class-getresource-and-classloader-getresource
 *
 *
 */
public class TestGetResource {
    public static void main(String[] args) {
        //If your path begins with / , which means absolute path, it will search from TestGetResource.class's  classpath,
        //in my case, it is D:/workspace/java/Java-Programming/out/production/P04/
        URL resource = TestGetResource.class.getResource("/file.txt");
        System.out.println(resource.getPath());///D:/workspace/java/Java-Programming/out/production/P04/file.txt

        //However, if not , which means relative path,it will search from where TestGetResource.class is located,
        //in my case, it is D:/workspace/java/Java-Programming/out/production/P04/com/lordbao/FilesAndReadData/note/
        URL resource1 = TestGetResource.class.getResource("../exercise/NumberOfStrings.class");
        System.out.println(resource1.getPath());///D:/workspace/java/Java-Programming/out/production/P04/com/lordbao/FilesAndReadData/exercise/NumberOfStrings.class

        //If you use class.getClassLoader().getResource instead, it will search from TestGetResource.class's classpath,
        //in my case, it is D:/workspace/java/Java-Programming/out/production/P04/
        //NOTE: you should NOT add /, or you will encounter a NullPointer Exception
        URL resource2 = TestGetResource.class.getClassLoader().getResource("file.txt");
        System.out.println(resource2.getPath());///D:/workspace/java/Java-Programming/out/production/P04/file.txt

        //NullPointer Exception
//        URL resource3 = TestGetResource.class.getClassLoader().getResource("/file.txt");
//        System.out.println(resource3.getPath());
    }
}
