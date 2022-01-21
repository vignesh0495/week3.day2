package week3.day2;

public class Intersection {
	public static void main(String[] args) 
	{
		int intersect1[]= {12,2,11,55,8,4};
		int intersect2[]= {10,21,11,4,55,17};
		for (int i =0;i<intersect1.length;i++)
		{
			for (int j =0;j<intersect2.length;j++)
			{
				if(intersect1[i]==intersect2[j])
					System.out.println(intersect1[i]);
			}
		}

	  }

}
