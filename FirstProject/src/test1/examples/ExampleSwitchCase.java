package test1.examples;

public class ExampleSwitchCase {

	public static void main(String[] args) {
		//int j = 1;
		String j = "Two";
		
		switch(j){
		//case 0:
		case "Zero":
			System.out.println("Value is 0");
			break;
		//case 1:
		case "One":
			System.out.println("Value is 1");
			break;
		//case 2:
		case "Two":
			System.out.println("Value is 2");
			break;
		//case 3:
		case "Three":
			System.out.println("Value is 3");
			break;
		default:
		    System.out.println("No Value");
		    break;
		    
		}

	}

}
