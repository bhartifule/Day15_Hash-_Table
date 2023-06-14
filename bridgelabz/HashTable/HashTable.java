package com.bridgelabz.HashTable;

import java.util.Hashtable;

public class HashTable 
{

	public static Hashtable<String, Integer> getWordFrequency(String sentence) {
        Hashtable<String, Integer> wordFrequency = new Hashtable<String, Integer>();
        String[] words = sentence.split(" ");
        for (String word : words) {
            word = word.toLowerCase();
            if (wordFrequency.containsKey(word)) {
                int count = wordFrequency.get(word);
                wordFrequency.put(word, count + 1);
            } else {
                wordFrequency.put(word, 1);
            }
        }
        return wordFrequency;
    }
    public static void main(String[] args) {
        String sentence = "To be or not to be";
        Hashtable<String, Integer> wordFrequency = getWordFrequency(sentence);
        for (String word : wordFrequency.keySet()) {
            System.out.println(word + ": " + wordFrequency.get(word));
        }
}
}
