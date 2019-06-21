package test1.examples;

public class ExampleString {

	public static void main(String[] args) {
		String x = "Nahush Divekar";
		System.out.println("Hello " + x);
		System.out.println(x.toUpperCase());
        System.out.println(x.toString());
        System.out.println(x.substring(5));
        System.out.println(x.substring(2,8));
        System.out.println(x.charAt(7));
        String age = "31";
        String salary = "32345.50";
        //Wrapper Classes
        
        int a = Integer.parseInt(age) + 1;
        System.out.println(a);
        double s = Double.parseDouble(salary) *.30;
        System.out.println(s);
             
        
        
	}

}
