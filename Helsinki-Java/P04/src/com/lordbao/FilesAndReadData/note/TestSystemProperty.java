package com.lordbao.FilesAndReadData.note;

import java.util.Properties;
import java.util.Set;

/**
 * @Author Lord_Bao
 * @Date 2024/4/29 9:36
 * @Version 1.0
 *
 * The resources come from https://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html
 *
 * "file.separator"	Character that separates components of a file path. This is "/" on UNIX and "\" on Windows.
 * "java.class.path"	Path used to find directories and JAR archives containing class files.
 *                      Elements of the class path are separated by a platform-specific character
 *                      specified in the path.separator property.
 * "java.home"	        Installation directory for Java Runtime Environment (JRE)
 * "java.vendor"	    JRE vendor name
 * "java.vendor.url"	JRE vendor URL
 * "java.version"	    JRE version number
 * "line.separator"	    Sequence used by operating system to separate lines in text files
 * "os.arch"	        Operating system architecture
 * "os.name"	        Operating system name
 * "os.version"	        Operating system version
 * "path.separator"	    Path separator character used in java.class.path
 * "user.dir"	        User working directory
 * "user.home"	        User home directory
 * "user.name"	        User account name
 */
public class TestSystemProperty {

    private static  void testSystemPropertyWithArgs(){
        System.out.println(System.getProperty("file.separator"));
        System.out.println(System.getProperty("java.class.path"));
        System.out.println(System.getProperty("java.home"));
        System.out.println(System.getProperty("java.vendor"));
        System.out.println(System.getProperty("java.vendor.url"));
        System.out.println(System.getProperty("java.version"));
        String lineSeparator = System.getProperty("line.separator");
        //Here in Windows it will print 13 10 which means \r\n.
        //\r means moving to current line's beginning,\n means moving to next line
        // Let * means cursor, I presume something will happen as below:
        // start:        abcd*
        // after \r :   *abcd
        // after \n :    abcd
        // In Linux,however,it will print only 10 which meas \n              *
        char[] lineSeparatorArray = lineSeparator.toCharArray();
        for (char ele: lineSeparatorArray) {
            System.out.printf("%d ",(int)ele);
        }
        System.out.println();
        System.out.println(System.getProperty("os.arch"));
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("os.version"));
        System.out.println(System.getProperty("path.separator"));
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("user.name"));
    }

    /*print all system properties*/
    private static  void testSystemPropertyWithoutArgs(){
        Properties properties = System.getProperties();
        Set<Object> keySet = properties.keySet();
        for(Object key :keySet){
            System.out.println(key+" : "+System.getProperties().getProperty((String) key));
        }
    }

    public static void main(String[] args) {
//        testSystemPropertyWithoutArgs();
        testSystemPropertyWithArgs();
    }
}
