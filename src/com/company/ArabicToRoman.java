package com.company;

public class ArabicToRoman {
    public String convert(int i) {
        String romanWord = "";
        for (int j = 0; j < i; j++) {
            romanWord += "I";
        }
        return romanWord;
    }
}
