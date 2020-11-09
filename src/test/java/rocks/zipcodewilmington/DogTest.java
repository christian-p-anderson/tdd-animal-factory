package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;

import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {

    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test
    public void constructorTest() {
        // GIVEN cat data
        String givenName = "Georgie";
        Date givenBirthdate = new Date();
        Integer givenId = 0;

        // When a dog is constructed
        Dog dog = new Dog(givenName, givenBirthdate, givenId);

        // When we retrieve data from Dog
        String retrievedName = dog.getName();
        Date retrievedBirthdate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthdate, retrievedBirthdate);
        Assert.assertEquals(givenId, retrievedId);

    }

    // TODO - Create tests for `speak`
    @Test
    public void speakTest() {
        Dog dog = new Dog(null, null, null);

        String expected = "bark!";

        String actual = dog.speak();

        Assert.assertEquals(expected, actual);
    }


    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest() {
        Dog dog = new Dog(null, null, null);

        Date expected = new Date();

        dog.setBirthDate(expected);

        Date actual = dog.getBirthDate();

        Assert.assertEquals(expected, actual);
    }


    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest() {
        Dog dog = new Dog(null, null, null);

        // Given
        Food food = new Food();
        int initialMealsEaten = dog.getNumberOfMealsEaten();
        int expected = initialMealsEaten + 1;

        // When
        dog.eat(food);
        int actual = dog.getNumberOfMealsEaten();

        // Then
        Assert.assertEquals(expected, actual);
    }


    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIdTest() {
        Dog dog = new Dog(null, null, 1);

        // Given
        int expected = 1;

        // When
        int actual = dog.getId();

        // Then
        Assert.assertEquals(expected, actual);
    }


    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void implementTest() {
        // Given
        Dog dog = new Dog(null, null, null);

        // When
        boolean outcome = dog instanceof Animal;

        // Then
        Assert.assertTrue(outcome);
    }


    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void inheritanceTest() {
        // Given
        Dog dog = new Dog(null, null, null);

        // When
        boolean outcome = dog instanceof Mammal;

        // Then
        Assert.assertTrue(outcome);
    }


    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
