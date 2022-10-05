package week1day1;

public class Bike {
	public void applyBreak() {
		System.out.println("apply break");
		System.out.println("sound Horn");
	} 
	public static void main(String[] args) {
        Bike a=new Bike();
		a.applyBreak();
	}
}
