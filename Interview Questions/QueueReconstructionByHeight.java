/*Queue Reconstruction by Height

Suppose you have a random list of people standing in a queue. Each person is described by a pair of integers (h, k), where h is the height of the person and k is the number of people in front of this person who have a height greater than or equal to h. Write an algorithm to reconstruct the queue.

Note:
The number of people is less than 1,100.

 
Example

Input:
[[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]

Output:
[[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]
*/
package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QueueReconstructionByHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = {{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
		//print2dArray(arr);
		reconstructQueue(arr);
		print2dArray(arr);
		//System.out.println("");
	}

	public static void print2dArray(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++)
				System.out.print(arr[i][j] + " ");
		}
		System.out.println();
	}
	public static int[][] reconstructQueue(int[][] people) {
		Arrays.sort(people, (a,b) -> a[0] == b[0] ? a[1]-b[1] : b[0]-a[0]);
		List<int[]> list = new ArrayList<int[]>();
		for(int[] person : people) {
			list.add(person[1],person);
		}
		return list.toArray(new int[list.size()][2]);
	}
}
