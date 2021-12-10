package fr.countries;


public class Country {
    private String name;

    // CONSTRUCTOR
    public Country(String name) {
        this.name = name;
    }

    // GETTERS
    public String getName() {
        return this.name;
    }

    public int getNameLength() {
        return this.name.length();
    }

// EXO EXCEPTION 2
    public void exceptionTest(int number, int divider) throws ArithmeticException {
        if (divider == 0) {
            System.out.println("The result of " + number + " divided by " + 1 + " (default replacment) " + " is : " + number / 1 + ".");
            throw new ArithmeticException("Not possible to divide by 0");
        } else {
            System.out.println("The result of " + number + " divided by " + divider + " is : " + number / divider + ".");
        }
    }



}

