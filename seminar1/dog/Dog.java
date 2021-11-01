package seminar1.dog;

public class Dog {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Dog(String n, int a) {
        setName(n);
        setAge(a);
    }

    public Dog() {
        setName("DefaultName");
        setAge(0);
    }

    public Dog(String n) {
        setName(n);
        setAge(0);
    }

    public Dog(int a) {
        setName("DefaultName");
        setAge(a);
    }

    public String toString() {
        return "Dog's name is " + getName() + " and age is " + getAge();
    }

    public String toHumanAge() {
        return getName() + "'s in human ages is " + getAge() * 7;
    }
}
