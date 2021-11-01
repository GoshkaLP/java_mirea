package seminar5;

public class MergeSort {

    public static void merge(Student[] a, Student[] l, Student[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i].compareTo(r[j]) > 0 || l[i].compareTo(r[j]) == 0) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    public static void mergeSort(Student[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        Student[] l = new Student[mid];
        Student[] r = new Student[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    public static Student[] sort(Student[] arr1, Student[] arr2) {
        Student[] arr3 = new Student[arr1.length + arr2.length];
        int i = 0;
        for (int j = 0; j < arr1.length; ++j) {
            arr3[i++] = arr1[j];
        }
        for (int j = 0; j < arr2.length; ++j) {
            arr3[i++] = arr2[j];
        }
        mergeSort(arr3, arr3.length);
        return arr3;
    }

    static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Student tmp = new Student();
        Student[] arr1 = tmp.generateArray(10);
        Student[] arr2 = tmp.generateArray(10);
        System.out.println("First array:");
        printArr(arr1);
        System.out.println("Second array:");
        printArr(arr2);

        Student[] arr3 = sort(arr1, arr2);
        System.out.println("Array after sorting:");
        printArr(arr3);
    }
}
