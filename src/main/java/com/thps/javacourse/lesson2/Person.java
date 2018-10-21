package com.thps.javacourse.lesson2;

import com.thps.javacourse.lesson3.Name;

public class Person {

    private Name personName;
    private static int personCounter;

    public Person(Name personName) {
        this.personName = personName;
    }

    public Person(){
        personCounter++;
        //def constructor
    }

    public String helloWorld() {
        return "Hello World";
    }

    public Name name(){
        return personName;
    }

    public String hello(String name) {
        return "Hello " +name ;
    }

    public static int numberOfPersons(){
        return personCounter;
    }
}
