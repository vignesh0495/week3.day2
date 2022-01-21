package week3.day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestNum {
	public static void main(String[] args) {
	    Integer[] data = {3,2,11,9,6,7,13};
		int len = data.length;
		List<Integer> num = Arrays.asList(data);
		Collections.sort(num);
		int secLar = num.get(len-2);
		System.out.println("The Second Largest Number is = " +secLar);
	}
}

/*public static void main(String[] args) {
	Integer[] data = {3,2,11,9,6,7,13};
	int len = data.length;
	   int n = FindSecLargest.getSecLargestNumber(data,len);
	//Passing the data and the length
	System.out.println(n);	
	}
*/	