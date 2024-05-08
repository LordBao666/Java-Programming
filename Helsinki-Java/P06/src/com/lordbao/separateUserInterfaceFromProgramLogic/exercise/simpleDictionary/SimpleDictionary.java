package com.lordbao.separateUserInterfaceFromProgramLogic.exercise.simpleDictionary;

/**
 * @Author Lord_Bao
 * @Date 2024/5/8 20:45
 * @Version 1.0
 */

import java.util.HashMap;

public class SimpleDictionary {

    private HashMap<String, String> translations;

    public SimpleDictionary() {
        this.translations = new HashMap<>();
    }

    public String translate(String word) {
        return this.translations.get(word);
    }

    public void add(String word, String translation) {
        this.translations.put(word, translation);
    }
}

