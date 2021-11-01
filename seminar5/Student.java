package seminar5;

import java.util.Random;

public class Student implements Comparable<Student> {
    protected int id;
    protected String name;
    protected String surname;
    protected int gpa;

    public Student(int id, String name, String surname, int gpa) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }

    public Student() {}

    public Student[] generateArray(int len) {
        Student[] arr = new Student[len];

        Random random = new Random();

        for (int i = 0; i < len; ++i) {
            String name="", surname="";
            int gpa, id;


            gpa = random.nextInt(11);
            id = random.nextInt(1000);

            for (int j = 0; j < 5; ++j) {
                name += String.valueOf((char)(random.nextInt(90-65+1) + 65));
                surname += String.valueOf((char)(random.nextInt(90-65+1) + 65));
            }
            arr[i] = new Student(id, name, surname, gpa);
        }

        return arr;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return o.getGpa() - this.getGpa();
    }
}
