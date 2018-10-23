package com.thps.javacourse.lesson2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class PersonTest {
    @Test
    public void shouldReturnHelloWorld(){
        Person czaro = new Person();
        Assertions.assertEquals("Hello World",czaro.helloWorld());
    }

    @Test
    public void shouldReturnHelloCzaro(){
        Person person = new Person();
        Assertions.assertEquals("Hello Czaro",person.hello("Czaro"));
    }

    @Test
    public void shouldReturnNumberOfPersons(){
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();

        Assertions.assertEquals(3,Person.numberOfPersons());
    }

    @Test
    public void demonstrateArrays(){
        Person[] persons = new Person[4];
        for(int i=0;i<persons.length;i++){
            persons[i] = new Person();

            System.out.println(persons[0].helloWorld());
        }
    }

    @Test
    public void demonstrateArraysAndForEach(){
        Person[] persons = new Person[4];
        for(int i=0;i<persons.length;i++){
            persons[i] = new Person();
        }

        for (Person person : persons){
            System.out.println(person.helloWorld());
        }
    }

}