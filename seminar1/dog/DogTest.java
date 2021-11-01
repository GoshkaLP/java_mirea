package seminar1.dog;

public class DogTest {
    public static void main(String[] args) {
        Dog d1 = new Dog("John", 12);
        Dog d2 = new Dog(2);
        Dog d3 = new Dog("Mike");
        d3.setAge(34);
        System.out.println(d3.getAge());
        System.out.println(d2.toHumanAge());
        System.out.println(d1);
    }
}
