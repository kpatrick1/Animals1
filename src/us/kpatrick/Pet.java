package us.kpatrick;

/**
 * Abstract Class for Pet
 * @author kpatr
 * @version 2.1.1
 */
public abstract class Pet {
    protected String name;
    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}