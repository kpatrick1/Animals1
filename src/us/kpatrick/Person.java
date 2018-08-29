package us.kpatrick;

/**
 * Abstract class for person
 * @author kpatr
 * @version 2.1.2
 */
public abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}