package edu.escuelaing.arep.services;

import edu.escuelaing.arep.model.Person;

public class PersonServices {

    public static String printPersona(Person person){
        return person.getName()+" "+person.getAge();
    }
}
