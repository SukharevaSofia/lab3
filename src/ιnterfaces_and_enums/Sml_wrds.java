package ιnterfaces_and_enums;

public enum Sml_wrds {
    IN("в"),
    AND("и"),
    HOW("как"),
    WHAT("что"),
    THIS("это"),
    DOT(". "),
    WHOM("себе"),
    COMMA(", ");

    private String s;
    Sml_wrds(String s) {
        this.s = s;
    }
    public String getWrd(){
        return s;
    }
}
