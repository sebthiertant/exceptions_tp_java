package fr.captain;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Captain {
    private String name;
    private int age;

    // CONSTRUCTOR
    public Captain(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // GETTERS
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // METHODS
    public void getCaptainAge() throws AgeCapException {
        try {
            if ((getAge() < 18) || (getAge() > 65)) {
                throw new AgeCapException();
            }
            }
            catch(ArithmeticException exception){
                exception.printStackTrace();
            }
        finally {
            System.out.println("The captain is " + getAge() + " years old.");
        }
    }

}
