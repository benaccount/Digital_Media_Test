package Test_Package.com;
import org.apache.commons.lang.RandomStringUtils;

public class AutomationEngineerTest {
	public String question_1(int length){
		return RandomStringUtils.randomNumeric(length);
	}
    public void question_2(int prime) {
    	 
		for (int i = 0; i < prime; i++) {
		 
		for (int j = 2; j < i; j++) {
		 
		if (i % j == 0) {
			System.out.println(prime + " not prime " );
		 break;
		 }
		 }
		 //if (isPrime)
		 System.out.print(i + " ");
		}
    }
    public void  question_3(int target)
    {
        // loop through HALF the numbers till the target
        for (long i = 0; i < target/2; i++)
        {
            // if we have a match
            if ((i * i) == target)
            {
            	System.out.println(i * i + "its perfect square " );
                
            }
        }

        // no matching number could be squared
        System.out.println("not perfect square " );
        
    }
}
 
