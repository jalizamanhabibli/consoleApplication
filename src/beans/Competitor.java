package beans;

import java.io.Serializable;

public class Competitor implements Serializable {
    private String name;
    private String surname;
    private int age;

    public Competitor(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return  "name=" + name +
                ", surname=" + surname +
                ", age=" + age;
    }
}
