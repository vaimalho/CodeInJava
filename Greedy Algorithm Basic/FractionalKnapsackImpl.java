package greedy;
import java.util.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FractionalKnapsackImpl {

	public void calculateWeight(List<FractionalKnapsack> list,int capacity) {
		
		Comparator<FractionalKnapsack> comp = new Comparator<FractionalKnapsack>() {

			@Override
			public int compare(FractionalKnapsack o1, FractionalKnapsack o2) {
				// TODO Auto-generated method stub
				if(o2.getPerUnitWeight()>o1.getPerUnitWeight())return 1;
				else return -1;
			}
			
		};
		Collections.sort(list,comp);
		
		int usedCapacity=0;
		double totalValue=0;
		
		for(FractionalKnapsack item : list) {
			if(usedCapacity + item.getWeight() <=capacity) {
				usedCapacity += item.getWeight();
				totalValue += item.getValue();
			}
			else {
				int leftCapacity = capacity-usedCapacity;
				double value = item.getPerUnitWeight()*leftCapacity;
				usedCapacity+=leftCapacity;
				totalValue+=value;
			}
			if(usedCapacity==capacity)
				break;
		}
		System.out.println("Total Weight: " + totalValue );
	}

}
