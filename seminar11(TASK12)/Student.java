package seminar11;

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

    public void quickSort(Student[] array, int low, int high) {
        if (array.length == 0)
            return;

        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        Student pivot = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (array[i].compareTo(pivot) < 0) {
                i++;
            }

            while (array[j].compareTo(pivot) > 0) {
                j--;
            }

            if (i <= j) {
                Student temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }

    public Student searchStudent(String name, String surname, Student[] arr) throws StudentNotFoundException,
            EmptyStringException  {
        if (name.equals("") | surname.equals("")) {
            throw new EmptyStringException("Name or surname is empty!");
        }
        boolean founded = false;
        Student res = null;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i].name.equals(name) && arr[i].surname.equals(surname)) {
                founded = true;
                res = arr[i];
                break;
            }
        }
        if (!founded) {
            throw new StudentNotFoundException("Student with this name and surname wasn't founded!");
        }
        return res;
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
