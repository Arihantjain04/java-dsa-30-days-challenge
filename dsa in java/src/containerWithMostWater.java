// which container formed using the height and width from heights array and index will contain most water ie maxm area
import java.util.ArrayList;
public class containerWithMostWater {

    public static int maxWater(ArrayList<Integer> arr){
        int lp = 0;
        int rp = arr.size() - 1;

        int height, width, currWater, maxWater, h1, h2;
        maxWater = 0;

        while(lp < rp){
            h1 = arr.get(lp);
            h2 = arr.get(rp);
            height = Math.min(h1, h2);
            width = rp - lp;
            currWater = height * width;
            maxWater = Math.max(currWater, maxWater);

            if(h1 < h2){
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> heights = new ArrayList<>();

        heights.add(1);
        heights.add(8);
        heights.add(6);
        heights.add(2);
        heights.add(5);
        heights.add(4);
        heights.add(8);
        heights.add(3);
        heights.add(7);

        System.out.println("Maximum water volume is : " + maxWater(heights));
    }
}
