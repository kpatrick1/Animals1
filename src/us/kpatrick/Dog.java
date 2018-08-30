package us.kpatrick;

/**
 * This class is for a Dog.
 * Created by Kevin Patrick on 8/24/2018.
 * @author Kevin_Patrick
 * @version 2.0.0
 */
public class Dog extends Pet implements Talkable {
    private boolean friendly;

    /**
     * Constructor Class sets the friendly status of dog.
     * @param friendly is the dog friendly
     * @param name the name of the dog
     */
    public Dog(boolean friendly, String name) {
        super(name);
        this.friendly = friendly;
    }

    /**
     * Check if dog is friendly
     * @return boolean is dog friendly
     */
    public boolean isFriendly() {
        return friendly;
    }

    /**
     * Make the dog bark
     * @return string of barking dog
     */
    @Override
    public String talk() {
        return "Bark";
    }

    /**
     * Output the dog name and if they are friendly
     * @return string Dog= 'name' friendly= 'boolean'
     */
    @Override
    public String toString() {
        return "Dog: " + "name=" + name + " friendly=" + friendly;
    }


}