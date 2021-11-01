package seminar5;

public class SortingStudentsByGPA {

    public static void quickSort(Student[] array, int low, int high) {
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
        quickSort(arr, 0, arr.length-1);
        System.out.println("Array after sorting:");
        printArr(arr);
    }

}
