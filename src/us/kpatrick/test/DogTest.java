package us.kpatrick.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import us.kpatrick.Dog;

import static org.junit.jupiter.api.Assertions.*;

class DogTest extends PetTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void isFriendly() {
        Dog guthrie = new Dog(true, "guthrie");
        assertTrue(guthrie.isFriendly());
        Dog captain = new Dog(false, "capatin");
        assertFalse(captain.isFriendly());
    }

    @Test
    void talk() {
        Dog guthrie = new Dog(true, "guthrie");
        assertTrue(guthrie.talk() instanceof String);
    }

    //@Test
    //void toString() {
    //}

    @Test
    void getName() {
        Dog guthrie = new Dog(true, "guthrie");
        assertTrue(guthrie.getName() == "guthrie");
    }
}