package service_classes;


import sentences.One_sentence;

public class CheckedException extends Exception{

    public CheckedException(String message){
        super(message);
    }

    /*public static String isEmpty(String s, One_sentence sentence) throws CheckedException{
        if(s == "") throw new CheckedException("Предложение не должно быть пустым!");
        return "Hе пустое:" + sentence.toString();
    }*/

}
