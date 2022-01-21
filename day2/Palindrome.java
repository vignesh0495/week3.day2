package week3.day2;

public class Palindrome {
	public static void main(String[] args) {
		String s1 = "ToyoT";
		String s2 = "";
		int len = s1.length();
		//Iterate over the String in reverse order
		for(int i=len-1;i>=0;i--) {
			s2 = s2 + s1.charAt(i);
			//Add the char into rev
		}
		//Compare the original String with the reversed String, if it is same then print palindrome 
		if(s1.equals(s2)) {
			System.out.println("Is a Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
}

}
