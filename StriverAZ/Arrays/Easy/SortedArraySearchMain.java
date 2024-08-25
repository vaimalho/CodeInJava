package arrays;

public class SortedArraySearchMain {

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 6};
        int K = 6;
        System.out.println(searchInSorted(arr, arr.length, K));
    }

    // Time Complexity: O(N)
    // Space Complexity: O(1)
    static int searchInSorted(int arr[], int N, int K) {

        for(int i : arr){
            if(i==K)
                return 1;
        }
        return -1;
    }

    // Time Complexity: O(logN)
    // Space Complexity: O(1)
    static int searchInSorted_Optimized(int arr[], int N, int K) {

        int low = 0;
        int high = N-1;

        while(low<=high){
            int mid = low + (high-low)/2;

            if(arr[mid] == K)
                return 1;
            else if(arr[mid] > K)
                high = mid-1;
            else low = mid +1;
        }
        return -1;
    }

}
