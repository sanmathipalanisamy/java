package week1day1;

public class Mobile {

	public void makecall(String name,float mobileweight) {
		System.out.println("my name is"+ name);
		System.out.println("floatnum"+mobileweight);
	}
	public void sendmeg(boolean  fullycharged, int mobilecost) {
		System.out.println(" isfullycharged"+ fullycharged);
		System.out.println("mobilecost is"+ mobilecost);
	}
	public static void main(String[] args) 
	{
		Mobile m=new Mobile();
		m.makecall("jio", 13.5f);
		m.sendmeg(true, 20000);
		System.out.println("This is my new mobile");
		
	}
	}

		
			
		
			
			
	    
			
		
		
				
		

	


