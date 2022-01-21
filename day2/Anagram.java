package week3.day2;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s1 = "twowheeler";
		String s2 = "wheelerstwo";
		//checking the length of the array
		int len1 = s1.length();
		int len2 = s2.length();
		int count = 0;
		char[] charArray1 = s1.toCharArray();
		char[] charArray2 = s2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		System.out.println(charArray1);
		System.out.println(charArray2);
		if(len1 == len2) {
			for(int i = 0;i<(len1-1);i++) {
				if((charArray1[i]) == (charArray2[i])){ 
					// Checking each character in the array is same
					count = count+1;
				}
			}
			if(Arrays.equals(charArray1,charArray2)) {
			System.out.println("Is an Anagram");
		}
	}else {
		System.out.println("Not an Anagram");
	}
	}
	}
