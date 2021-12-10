package fr;

import fr.captain.AgeCapException;
import fr.captain.Captain;
import fr.countries.Country;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws AgeCapException {
        Country country1 = new Country("France");
        Country country2 = new Country("Allemagne");
        Country country3 = new Country("Italie");
        Country country4 = new Country("Cuba");

        ArrayList<Country> countryArrayList = new ArrayList<Country>();

        countryArrayList.add(country1);
        countryArrayList.add(country2);
        countryArrayList.add(country3);
        countryArrayList.add(country4);

        System.out.println("La liste contient " + countryArrayList.size() + " pays !"); // a
        countryArrayList.forEach((country) -> System.out.println(country.getName())); // b

        //countryArrayList.clear(); // c

        countryArrayList.sort(Comparator.comparing(Country::getName));

        System.out.println("La liste contient " + countryArrayList.size() + " pays !"); //
        countryArrayList.forEach((country) -> System.out.println(country.getName())); //

        countryArrayList.sort(Comparator.comparing(Country::getNameLength));

        System.out.println("La liste triée par taille de nom"); // a
        countryArrayList.forEach((country) -> System.out.println(country.getName())); //


       /* try{
            country1.exceptionTest(2, 0);
            }
        catch(ArithmeticException exception){
            exception.printStackTrace();
            }
    */

        Captain captain = new Captain("Hook", 67);
        captain.getCaptainAge();
        System.out.println("LOL test");
    }
}
