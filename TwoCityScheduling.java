package leetcode;

/*Two City Scheduling

There are 2N people a company is planning to interview. The cost of flying the i-th person to city A is costs[i][0], and the cost of flying the i-th person to city B is costs[i][1].

Return the minimum cost to fly every person to a city such that exactly N people arrive in each city.

 

Example 1:

Input: [[10,20],[30,200],[400,50],[30,20]]
Output: 110
Explanation: 
The first person goes to city A for a cost of 10.
The second person goes to city A for a cost of 30.
The third person goes to city B for a cost of 50.
The fourth person goes to city B for a cost of 20.

The total minimum cost is 10 + 30 + 50 + 20 = 110 to have half the people interviewing in each city.
 

Note:

1 <= costs.length <= 100
It is guaranteed that costs.length is even.
1 <= costs[i][0], costs[i][1] <= 1000
*/
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class TwoCityScheduling {

    static int[][] costs = {{259,770},{448,54},{926,667},{184,139},{840,118},{577,469}};
    //static int[][] costs = {{10,20},{30,200},{400,50},{30,20}};
	public static void main(String[] args) {

		printArray(costs);
		
		System.out.println(twoCitySchedCost(costs));
	}

	public static void printArray(int[][] costs) {
		for(int i=0;i<costs.length;i++)
			for(int j=0;j<costs[0].length;j++) {
				System.out.print(costs[i][j] + " ");
			}
		System.out.println();
	}
public static int twoCitySchedCost(int[][] costs) {
	
	int n = costs.length;
	int mid = n/2;
	int sum=0;
	int countA=0;
	int countB=0;
	Arrays.sort(costs,(a,b) -> Math.abs(b[1] - b[0]) - Math.abs(a[1] - a[0]));
	for(int i=0;i<n;i++) {

		if(costs[i][0]<costs[i][1]) {
			if(countA<mid) {
				sum+=costs[i][0];
				countA++;
			}
			else {
				sum+=costs[i][1];
			}
		}
		else {
			if(countB<mid) {
				sum+=costs[i][1];
				countB++;
			}
			else {
				sum+=costs[i][0];
			}
		}
			
	}
    return sum;
    }

}
