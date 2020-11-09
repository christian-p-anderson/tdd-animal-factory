package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void addDogTest() {
        // Given
        Dog expected = new Dog();
        Integer id = expected.getId();

        // When
        DogHouse.add(expected);
        Dog actual = DogHouse.getDogById(id);

        // Then
        Assert.assertEquals(expected, actual);
    }


    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeTest() {
        // Given
        Dog dogToBeAdded = new Dog(null, null, 0);
        DogHouse.add(dogToBeAdded);
        Integer id = dogToBeAdded.getId();

        // When
        DogHouse.remove(id);
        Dog retrievedDog = DogHouse.getDogById(id);

        // Then
        Assert.assertNull(retrievedDog);

    }


    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void removeByDogTest() {
        // Given
        Dog dogToBeAdded = new Dog(null, null, 0);
        DogHouse.add(dogToBeAdded);
        Integer id = dogToBeAdded.getId();

        // When
        DogHouse.remove(dogToBeAdded);
        Dog retrievedDog = DogHouse.getDogById(id);

        // Then
        Assert.assertNull(retrievedDog);
    }


    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void getDogById() {
        // Given
        Dog dog = new Dog(null, null, 3);
        Integer id = dog.getId();
        DogHouse.add(dog);

        // When
        Dog retrievedDog = DogHouse.getDogById(id);

        // Then
        Assert.assertEquals(dog, retrievedDog);

    }



    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
