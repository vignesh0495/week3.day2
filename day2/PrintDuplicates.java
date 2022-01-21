package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicates {
			public static void main(String[] args) {
			Integer[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
			Set<Integer> num = new HashSet<Integer>();
			Set<Integer> dupNum = new HashSet<Integer>();
			//using for each condition
			for(int a : arr) {
				boolean add = num.add(a);
				if(!add) {
					dupNum.add(a);
				}
			
		}
			System.out.println("The duplicate values are = " +dupNum);
	}

}
