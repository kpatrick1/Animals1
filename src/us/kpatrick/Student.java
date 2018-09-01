package us.kpatrick;

/**
 * Person class description here
 * @author kpatr
 * @version 1.2.1
 */
public class Student extends Person implements Talkable {
    private int age;

    /**
     * Student Constructor takes age and name
     * @param age age of the student
     * @param name name of the student
     */
    public Student(int age, String name) {
        super(name);
        this.age = age;
    }

    /**
     * Get the students age
     * @return int as students age
     */
    public int getAge() {
        return age;
    }
    /**
     * Get the students age
     * @param age the age of the student
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * output the string
     * @return string asking to talk
     */
    @Override
    public String talk() {
        return "Can we talk about my grade.";
    }
}
