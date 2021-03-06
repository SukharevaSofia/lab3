package com.company;

import sentences.*;
import service_classes.CheckedException;
import service_classes.UncheckedException;

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

        Last_sentence last = new Last_sentence();
        Later_sentence later = new Later_sentence();
        Lastest_sentence lastest = new Lastest_sentence();

        story.append(one).append(two).append("\n").append(three);
        story.append(first).append(second).append("\n").append(third).append(fourth).append(fifth).append("\n").append(sixth).append(seventh);

        story.append("\n").append(last).append(later).append("\n").append(lastest);

        System.out.println(story);
        try {
            one.cheking(one);
        } catch (CheckedException e) {
            e.printStackTrace();
        }
        try {
            one.uncheking(one);
        } catch (UncheckedException e){
            e.printStackTrace();
        }

    }

}
