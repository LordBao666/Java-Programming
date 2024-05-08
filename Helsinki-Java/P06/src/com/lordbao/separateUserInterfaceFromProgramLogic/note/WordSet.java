package com.lordbao.separateUserInterfaceFromProgramLogic.note;

import java.util.ArrayList;

/**
 * @Author Lord_Bao
 * @Date 2024/5/8 20:16
 * @Version 1.0
 */
public class WordSet {
    private ArrayList<String> words;

    public WordSet(){
        words= new ArrayList<>();
    }

    public void add(String word){
        words.add(word);
    }

    public boolean contains(String word){
        return words.contains(word);
    }

    /**
     *
     * @return the number of palindromes in the words
     */
    public int palindromes(){
        int count=0;
        for (String word:words){
            if(isPalindrome(word)){
                count++;
            }
        }
        return count;
    }

    private boolean isPalindrome(String word){
        int len = word.length();
        int i=0,j=len-1;
        while (i<j){
            if(word.charAt(i)!=word.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
