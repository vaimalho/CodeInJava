// Activity Selection Problem
// It is a Greedy Algo

// Given N Activities with their Start and End Time. Calculate the maximum number of Activities that a person can perform
// Assuming that the Person can work on 1 Activity at a time

import java.util.Arrays;

public class ActivitySelectionProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] activities = {{0,6},{3,4},{1,2},{5,8},{5,7},{8,9}};
		System.out.println(maxActivities(activities));
	}
	
	public static int maxActivities(int[][] activities) {
		
		// Step 1 -> Sort the Activities According to their Finish Times
		Arrays.sort(activities, (a,b) -> a[1] - b[1]);
		
		// Step 2 -> Select the First Activity from Sorted Array, as it will always be Performed hence count=1
		int count = 1;
		int prev = activities[0][1];
		
		// Step-3 For the Remaining Activities check :
		// If the Start Time of that Activity >= Finish Time Of Previous Activity
		// Then it will be Performed hence count++
		
		for(int i=1;i<activities.length;i++) {
			if(activities[i][0] >= prev) {
				prev=activities[i][1];
				count++;
			}
				
		}
		return count;
	}

}
