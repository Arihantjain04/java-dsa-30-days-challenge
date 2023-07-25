// array of size 2M+1, M elements occur twice and 1 unique element 

import java.util.Scanner;

public class uniqueElement{
    
    public static int findUnique(int[] arr){
        int m = arr.length;
        int ans = 0;
        for(int i = 0; i < m; i++){
            ans = ans ^ arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,1,2,3,4,5,19};

        Scanner sc = new Scanner(System.in);

        System.out.print("enter size : ");
        int size = sc.nextInt();
        System.out.println(findUnique(arr));
    }
}