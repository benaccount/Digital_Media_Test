package Test_Package.com;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.RandomStringUtils;

public class AutomationEngineerTest {
	public String question_1(int length){
		return RandomStringUtils.randomNumeric(length);
	}
	public  String generateString(int length){
		return RandomStringUtils.randomAlphabetic(length);
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
    public void question_9(int n) {
		if (n <= 0)
			System.out.println("Counting can't be null ");
	 
		String result = "1";
		int i = 1;
	 
		while (i < n) {
			StringBuilder sb = new StringBuilder();
			int count = 1;
			for (int j = 1; j < result.length(); j++) {
				if (result.charAt(j) == result.charAt(j - 1)) {
					count++;
				} else {
					sb.append(count);
					sb.append(result.charAt(j - 1));
					count = 1;
				}
			}
	 
			sb.append(count);
			sb.append(result.charAt(result.length() - 1));
			result = sb.toString();
			i++;
		}
		System.out.println("Counting is : " + result);
		
    }
    
    public void question_4(String test) {
                    test = test.toLowerCase();
        List<Character> vowels = new ArrayList<Character>();
        vowels.addAll(Arrays.asList(new Character[]{'a', 'e', 'i', 'o', 'u'}));
        List<Character> consonants = new ArrayList<Character>();
        consonants.addAll(Arrays.asList(new Character[]{'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'}));
        int vcount = 0;
        int ccount = 0;
        for (int i = 0; i < test.length(); i++){
            Character letter = test.charAt(i);
            if (vowels.contains(letter)){
                vcount ++;
            } else if (consonants.contains(letter)){
                ccount++;
            }
        }

        System.out.println(vcount);
        System.out.println(ccount);
    }
    
    public void question_6(String str) 
    {
        final Map<Character, Integer> map;

        map = new HashMap<>();  
        map.put('a', 1);
        map.put('b', 2);
        map.put('c', 3);
        map.put('d', 4);
        map.put('e', 5);
        map.put('f', 6);
        map.put('g', 7);
        map.put('h', 8);
        map.put('i', 9);
        map.put('j', 10);
        map.put('k', 11);
        map.put('l', 12);
        map.put('m', 13);
        map.put('n', 14);
        map.put('o', 15);
        map.put('p', 16);
        map.put('q', 17);
        map.put('r', 18);
        map.put('s', 19);
        map.put('t', 20);
        map.put('u', 21);
        map.put('v', 22);
        map.put('w', 23);
        map.put('x', 24);
        map.put('y', 25);
        map.put('z', 26);

      
        for(final char c : str.toCharArray())
        {
            final Integer val;

            val = map.get(c);

            if(val == null)
            {   
            	System.out.print("Sorry, it can't be null");
            }
            else
            {
                System.out.print(val + " ");
            }
        }

        System.out.println();
    }


}
 
