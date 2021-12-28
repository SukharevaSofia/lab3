package service_classes;

public enum Sml_wrds {
    IN("в"),
    AND("и"),
    HOW("как"),
    WHAT("что"),
    THIS("это"),
    DOT(". "),
    WHOM("себе"),
    COMMA(", "),
    COLON(": "),
    BUT("Но"),
    WITH("c"),
    AT("на"),
    ONLY("Только ");

    private String s;
    Sml_wrds(String s) {
        this.s = s;
    }
    public String getWrd(){
        return s;
    }
}
