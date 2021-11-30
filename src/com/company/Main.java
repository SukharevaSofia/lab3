package com.company;

import persons.Misa;
import sentences.First_sentence;
import sentences.Fourth_sentence;
import sentences.Second_sentence;
import sentences.Third_sentence;

public class Main {

    public static void main(String[] args) {

        StringBuilder story = new StringBuilder();
        First_sentence first = new First_sentence();
        Second_sentence second = new Second_sentence();
        Third_sentence third = new Third_sentence();
        Fourth_sentence fourth = new Fourth_sentence();
        story.append(first).append(second).append(third).append(fourth);
        System.out.println(story);
    }

}
