package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondLargestNumberMain {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(32011 ,123,1045, 1205, 254, 28763, 6537, 3161));
        System.out.println(print2largest(arr));

    }

    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public static int print2largest(List<Integer> arr) {

        if(arr.size() < 0)
            return -1;
        if(arr.size() == 1)
            return arr.get(0);

        int largest = arr.get(0);
        int secondLargest = -1;

        for(int i : arr){
            if( i > largest){
                secondLargest = largest;
                largest = i;
            }
            else if(i > secondLargest && i != largest)
                secondLargest = i;

        }
        return secondLargest;
    }


}
