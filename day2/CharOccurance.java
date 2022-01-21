package week3.day2;

public class CharOccurance {
	
	public static void main(String[] args) 
		{
			
			String str = "welcome to chennai ";
			int count = 0;
			char rep='e' ;
			char[] charArray= str.toCharArray();
			int len=charArray.length;
			System.out.println(len);
				for(int i=0;i<=len-1;i++) 
				{
					if(str.charAt(i)==rep)
					{
					count=count+1;					}
				}
			System.out.println("The character count is"+count);
							
		}

}
