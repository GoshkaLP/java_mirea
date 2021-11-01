package seminar5;

public class InsertionSort {
    public static void sort(Student[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            Student cur = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].getId() > cur.getId()) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = cur;
        }
    }

    static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Student tmp = new Student();
        Student[] arr = tmp.generateArray(20);

        System.out.println("Array before sorting:");
        printArr(arr);
        sort(arr);
        System.out.println("Array after sorting:");
        printArr(arr);
    }
}
