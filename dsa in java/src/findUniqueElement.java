import java.util.Scanner;

class findUniqueElement {

    public static int findUnique(int[] arr) {
        int size = arr.length;
        int ans = 0;

        for(int i = 0; i < size; ++i) {
            ans ^= arr[i];
        }

        return ans;
    }

    public static void main(String[] var0) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 19};
        Scanner sc = new Scanner(System.in);
        System.out.println(findUnique(arr));
    }
}