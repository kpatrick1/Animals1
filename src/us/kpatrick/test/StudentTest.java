package us.kpatrick.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import us.kpatrick.Student;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest extends PetTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getAge() {
        Student k = new Student(33,"Kevin");
        assertTrue(k.getAge() == 33);
    }

    @Test
    void setAge() {
        Student K = new Student( 33, "Kevin");
        K.setAge(34);
        assertTrue( K.getAge() == 34);
    }

    @Test
    void talk() {
        Student k = new Student( 33, "Kevin");
        assertTrue(k.talk() instanceof String);
    }

    @Test
    void getName() {
        Student k = new Student(33, "Kevin");
        assertTrue(k.getName() == "Kevin");
    }

    @Test
    void setName() {
        Student k = new Student(33,"kevin");
        k.setName("Bob");
        assertTrue(k.getName() == "Bob");
    }
}