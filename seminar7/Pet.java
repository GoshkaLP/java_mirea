package seminar7;

public class Pet {
    protected String name;
    protected boolean canFly;
    protected int age;
    protected int weight;

    public Pet(String name, boolean canFly, int age, int weight) {
        this.name = name;
        this.canFly = canFly;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", canFly=" + canFly +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
