package test1.examples;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class ExampleAndOr {
@Test
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		if(x > 0 && y > 0){
			System.out.println("both number's are +ve ");
		}else if (x > 0 || y > 0){
             System.out.println("at least one number is +ve");
            }else{
            	System.out.println("both number's are -ve ");
            }

	}

}
