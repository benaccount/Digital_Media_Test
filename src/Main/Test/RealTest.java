package Main.Test;

import org.testng.annotations.Test;

import Test_Package.com.AutomationEngineerTest;

public class RealTest {
	private AutomationEngineerTest testing = new AutomationEngineerTest();
	@Test
	public void randonGenerator()
	{
		
		System.out.println(testing.question_1(5));
	}
	@Test	
	public void primeNumber()
	{
      int prime_number = Integer.parseInt(testing.question_1(5));
	   testing.question_2(prime_number);
	}
	@Test
	public void perfectSquare(){
		int perfect_number = Integer.parseInt(testing.question_1(5));
		testing.question_3(perfect_number);
	
	}
	

}
