package tests;

import animals.AnimalType;
import animals.petstore.pet.attributes.Breed;
import animals.petstore.pet.attributes.Gender;
import animals.petstore.pet.attributes.Skin;
import animals.petstore.pet.types.Bird;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class BirdTest {
    private static Bird actualBird;

    @BeforeAll
    public static void createAnimals()
    {
        actualBird = new Bird(AnimalType.DOMESTIC, Skin.FEATHERS, Gender.UNKNOWN, Breed.UNKNOWN);
    }
    @Test
    @Order(1)
    @DisplayName("Animal Test Type Tests Domestic")
    public void animalTypeTests()
    {
        assertEquals(AnimalType.DOMESTIC, actualBird.getAnimalType(), "Animal Type Expected[" + AnimalType.DOMESTIC
                + "] Actual[" + actualBird.getAnimalType() + "]");
    }

    @Test
    @Order(1)
    @DisplayName("Getting Number of Legs Test")
    public void birdLegsTest()
    {
        assertEquals(2, actualBird.getNumberOfLegs(), "Number of Legs Expected[" + 2
                + "] Actual[" + actualBird.getNumberOfLegs() + "]");
    }

    @Test
    @Order(1)
    @DisplayName("Bird Speak Tweet Tests")
    public void birdGoesTweetTest()
    {
        assertEquals("The bird goes tweet! tweet!", actualBird.speak(), "I was expecting tweet! tweet!");
    }


    @Test
    @Order(1)
    @DisplayName("Bird Feathers are they Hyperallergetic")
    public void birdHyperAllergeticTests()
    {
        assertEquals("The bird is not hyperallergetic!", actualBird.birdHypoallergenic(),
                "The bird is not hyperallergetic!");
    }

    @Test
    @Order(1)
    @DisplayName("Bird has legs Test")
    public void legTests()
    {
        Assertions.assertNotNull(actualBird.getNumberOfLegs());
    }

    @Test
    @Order(2)
    @DisplayName("Bird Gender Test Male")
    public void genderTestMale()
    {
        actualBird = new Bird(AnimalType.WILD, Skin.UNKNOWN,Gender.MALE, Breed.UNKNOWN);
        assertEquals(Gender.MALE, actualBird.getGender(), "Expecting Male Gender!");
    }

    @Test
    @Order(2)
    @DisplayName("Bird Breed Test Hawk")
    public void genderBirdBreed() {
        actualBird = new Bird(AnimalType.WILD, Skin.FEATHERS, Gender.FEMALE, Breed.HAWK);
        assertEquals(Breed.HAWK, actualBird.getBreed(), "Expecting Breed Hawk!");
    }

    @Test
    @Order(2)
    @DisplayName("Bird Speak Squawk Tests")
    public void birdGoesSquawkTest()
    {
        actualBird = new Bird(AnimalType.WILD, Skin.UNKNOWN,Gender.UNKNOWN, Breed.UNKNOWN);
        assertEquals("The bird goes squawk! squawk!", actualBird.speak(), "I was expecting squawk! squawk!");
    }

    @Test
    @Order(2)
    @DisplayName("Bird Speak Chirp Tests 1")
    public void birdGoesChirpTest()
    {
        actualBird = new Bird(AnimalType.UNKNOWN, Skin.UNKNOWN,Gender.UNKNOWN, Breed.UNKNOWN);
        assertEquals("The bird goes Chirp! Chirp!", actualBird.speak(), "I was expecting Chirp");
    }
}
