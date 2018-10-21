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
}