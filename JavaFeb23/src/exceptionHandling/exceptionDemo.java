package exceptionHandling;

public class exceptionDemo {

	public static void main(String[] args) {
		// 
		
		try {
		System.out.println("Let us figure out an exception! ");
		
		String [] name = {"ProSmart", "Java", "Selenium","Eclipse"};
		
		System.out.println(name[4]);
		System.out.println("dead code coz its after the exception and its got unreachable");
		
		} catch (Exception e ) {
			System.out.println("Exception occured! "+ e.getMessage());
			System.out.println("O my God!! I could handle one");
		}
           System.out.println("I am out of the catch block now");
		
		
	}

}
