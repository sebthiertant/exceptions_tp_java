package fr.captain;

public class AgeCapException extends Exception {

    public String toString() {
        return "The age of the captain is not in the valid range.";
    }
}
