package week3.day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElements {
	public static void main(String[] args) {
		Integer[] arr = {1,5,2,3,4,7,6,8,10};
		int l = arr.length;
		List<Integer> num = Arrays.asList(arr);
		Collections.sort(num);
		int firstNum = num.get(0);
		System.out.println("The missing element is");
		for(int i=0;i<l;i++) {
			if(num.get(i)==(firstNum+i)) {
				continue;
			}else {
				System.out.println(firstNum+i);
				break;
			}
		}
	}

}
