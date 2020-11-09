package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void createDogTest() {
        // given (there is a dog name)
        String expectedName = "Milo";

        // given (there is a dog birthdate)
        Date expectedBirthDate = new Date();

        // when a dog is created with those fields
        Dog dog = AnimalFactory.createDog(expectedName, expectedBirthDate);

        // when we get the name of the dog
        String actualName = dog.getName();

        // when we get birthdate of the dog
        Date actualBirthDate = dog.getBirthDate();

        // then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBirthDate, actualBirthDate);
    }

    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void createCatTest() {
        // Given (there is a cat name)
        String expectedName = "Fluff";

        // Given (there is a cat birthdate)
        Date expectedBirthDate = new Date();

        // When a cat is created with those fields
        Cat cat = AnimalFactory.createCat(expectedName, expectedBirthDate);

        // When we get the name of the cat
        String actualName = cat.getName();

        // When we get the birthdate of the cat
        Date actualBirthDate = cat.getBirthDate();

        // Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBirthDate, actualBirthDate);
    }
}
