public class rotationOfArray {

    // to rotate an array by k indices
    // formula - newArr[(i+k)%n] = arr[i]
    // property of mod x%n ε belongs to [0, n-1]

    public static int[] rotate(int[] array, int k) {

        int n = array.length;
        int newArr[] = new int[n];

        for (int i = 0; i < n; i++) {
            newArr[(i + k) % n] = array[i];
        }

        return newArr;
    }

    // only for ascending

    public static boolean isRotated(int array[]) {

        int n = array.length;
        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            if (array[i] > array[i + 1] || array[0] < array[n - 1]) {
                count++;
            }
        }
        if (count >= 2) {
            return false;
        }

        return true;
    }

    public static int pivotPoint(int[] arr){

        int n = arr.length;
        int pivot = 0;

        for(int i = 0; i < n-1; i++){
            if(arr[i] > arr[i+1]){
                pivot = arr[i];
            }
        }

        return pivot;
    }

    public static void printArr(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 7 };

        int[] rotatedArr = new int[arr.length];

        rotatedArr = rotate(arr, 2);

        printArr(rotatedArr);

        System.out.println(isRotated(rotatedArr));

        System.out.println(pivotPoint(rotatedArr));
    }
}
