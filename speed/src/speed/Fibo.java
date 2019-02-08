package speed;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

public class Fibo {
	
	
	public static void ymlusers() {
		ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
		
		try {
			Ymluser user = mapper.readValue(new File("address.yml"), Ymluser.class);
			System.out.println(user);

		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void calenders() {
		
	
		LocalDateTime currentdate = LocalDateTime.now();
		LocalDateTime hoursbefore = currentdate.minusHours(2);
		LocalDateTime hourslater = currentdate.minusHours(-3);
		
		
		System.out.println("Today is "+currentdate);
		System.out.println("Today is "+hoursbefore);
		System.out.println("Today is "+hourslater);
		
	}
	
	public static void testarray()
	{
			ArrayList<String> namelist=new ArrayList<String>();//Creating arraylist  
			namelist.add("Ravi");//Adding object in arraylist  
			namelist.add("Vijay");  
			namelist.add("Ravi");  
			namelist.add("Ajay");  
			//Traversing list through Iterator  
			
			String pick = namelist.get(1);
			System.out.println("PICK: " + pick);
			
			List<String> subpick = namelist.subList(1, 3);
			
			for (String sub: subpick) {
				System.out.println("Sub list: "+sub);
			}
			
			subpick.sort(null);
			for (String sub: subpick) {
				System.out.println("Sorted Sub list: "+sub);
			}
			  
			for (String names : namelist) {
				System.out.println("names: " + names);
			}
	}
	
	
	

	public static void reversenumber() {
		
		int number = 9876;
		
		int i = number;
		int revnum = 0;
		int mod10 = 0;
		
		double decimalnum = 9989;
		double fraction = decimalnum/2;
		System.out.println(fraction);
		while (i!=0) {
			mod10 = i%10;
		
			revnum = revnum * 10 +mod10;
			i /= 10;
			System.out.println(i);
		}
		
		System.out.println("Reminder: "+revnum);
	}
	
	
	
	
	public static void palindrome() {
		
		String text = "TIPPO";
		String palind = null;
		int length = text.length();
		palind = text;
		System.out.println("Normal Text: "+text);
		while(length!=0){
			char reversechar = text.charAt(length-1);
			palind = palind+reversechar;
			length--;
		}

		System.out.println("Palindrome Text: "+palind);
	}

	public static void fibonacci(){
	
	int temp = 0;
	int temp2 = 1;
	
	System.out.println("Fibonacci Series");
	for (int i=0; i <= 10; i ++) {
		
		System.out.println(temp+", ");
		int sum = temp+temp2;
		temp2 = temp;
		temp = sum;
	}
}
	
	public static void Prime() {
	        int num = 29;
	        boolean flag = false;
	        
	        for(int i = 2; i <= num/2; ++i)
	        {
	            // condition for nonprime number
	            if(num % i == 0)
	            {
	                flag = true;
	                break;
	            }
	        }

	        if (!flag)
	            System.out.println(num + " is a prime number.");
	        else
	            System.out.println(num + " is not a prime number.");
	    }
	
	public static void NumberDigits() {


	        int count = 0, num = 3452;

	        while(num != 0)
	        {
	            // num = num/10
	            num /= 10;
	            count++;
	        }

	        System.out.println("Number of digits: " + count);
	    }
	
}
