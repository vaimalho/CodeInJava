// Fractional Knapsack Problem
// Fill the Knapsack such that it's value is maximum
// Important ->
// 1. The weight can be utmost W
// 2. Items can be broken down into Fraction
package greedy;
import java.util.*;
import java.util.Collections;
import java.util.Comparator;

public class FractionalKnapsackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<FractionalKnapsack> list = new ArrayList<FractionalKnapsack>();
		int[] value = {6,2,1,8,3,5};
		int[] weight = {6,10,3,5,1,3};
		int capacity=10;
		
		for(int i=0;i<value.length;i++) {
			list.add(new FractionalKnapsack(value[i],weight[i]));
		}
		new FractionalKnapsackImpl().calculateWeight(list,capacity);

	}

	
	
}
