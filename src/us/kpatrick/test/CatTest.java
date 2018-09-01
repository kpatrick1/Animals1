package us.kpatrick.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import us.kpatrick.Cat;

import static org.junit.jupiter.api.Assertions.*;

class CatTest extends PetTest {

    @BeforeEach
    void setUp() {
        CatTest c = new CatTest();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getMousesKilled() {
        Cat c = new Cat(2,"kitty");
        c.addMouse();
        assertTrue(c.getMousesKilled()==3);
    }

    @Test
    void addMouse() {
        //TESTED IN getMousesKilled
    }

    @Test
    void talk() {
        Cat c = new Cat(2, "kitty");
        assertTrue( c.talk() instanceof String);
    }

    //@Test
    //void toString() {
    //    Cat c = new Cat(2,"Kitty");
    //    assertTrue(c.toString() instanceof String);
    //}

    @Test
    void getName() {
        Cat c = new Cat(2, "kitty");
        assertTrue(c.getName() == "kitty");
    }
}