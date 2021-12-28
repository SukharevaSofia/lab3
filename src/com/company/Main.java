package com.company;

import sentences.*;

public class Main {

    public static void main(String[] args) {

        One_sentence one = new One_sentence();
        Two_sentence two = new Two_sentence();
        Three_sentence three = new Three_sentence();

        StringBuilder story = new StringBuilder();
        First_sentence first = new First_sentence();
        Second_sentence second = new Second_sentence();
        Third_sentence third = new Third_sentence();
        Fourth_sentence fourth = new Fourth_sentence();
        Fifth_sentence fifth = new Fifth_sentence();
        Sixth_sentence sixth = new Sixth_sentence();
        Seventh_sentence seventh = new Seventh_sentence();
        story.append(one).append(two).append(three);
        story.append(first).append(second).append(third).append(fourth).append(fifth).append(sixth).append(seventh);

        System.out.println(story);

    }

}
