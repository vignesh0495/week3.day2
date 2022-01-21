package week3.day2;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
	
	public static void main(String[] args) {
		
		int[]num= {2,3,6,7,1,5,8,9,10,2,5,6,10};
		
        Set<Integer> uniquenum=new TreeSet<Integer>();
        
        for (int i = 0; i < num.length; i++) {
            uniquenum.add(num[i]);
            }
        System.out.println(uniquenum);
	
	//[1, 2, 3, 5, 6, 7, 8, 9, 10]missing elements
        
    List<Integer>dupnum=new ArrayList<Integer>(uniquenum);
    for (int i=1; i < dupnum.size();i++){
        if(i!=dupnum.get(i-1)) {//[4]
            System.out.println(i);
            break;
        }
        
    }
	}
	
}
