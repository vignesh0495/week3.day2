package week3.day2;

public class College extends University{
	public void ug() {
		
		System.out.println("Post Graduation");
	}
	public static void main(String[] args) {
		College coll = new College();
		
		coll.ug();
		coll.pg();
		
	}

}
