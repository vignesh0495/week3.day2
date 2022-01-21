package week3.day2;

public  class Desktop {
	
	public void hardwareResources() {
		
		System.out.println("Monitor");
		
	}
	
	public void softwareResources() {
		System.out.println("Eclipse");
	}
	public  void deskTopMode1(){
		
		System.out.println("Logitech company");

}
	
	public static void main(String[] args) {
		Desktop PC = new Desktop();
		PC.hardwareResources();
		PC.softwareResources();
		PC.deskTopMode1();
	}
}
