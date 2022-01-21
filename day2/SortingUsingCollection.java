package week3.day2;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class SortingUsingCollection {

	public static void main(String[] args) {
		String[] input = {"HCL","Wipro","Aspire system","CTS"}; 
	//convey array to list
		List<String> comp = Arrays.asList(input);
	//get length of array
		int size = comp.size();
		int length = input.length;
    //sort the array
		Collections.sort(comp);
	    Arrays.sort(input);
	//iterate it in reverse order
	//print array
	    for(int i=size-1; i>=0; i--) {
	    	System.out.println(comp.get(i));
	     }
	    for(int i=length-1; i>=0; i--) {
	    	System.out.println(input[i]);
	    }
	}
	
}
