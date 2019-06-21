package test1.examples;

public class ExampleArrays {

	public static void main(String[] args) {
		int[] a = {10,20,30,40,50};
		System.out.println(a[1] + " " + a[3] + " " + a[2] );
		// enhanced for statement
		for (int temp : a){
			System.out.println(temp);
		}
		System.out.println("----------------");
		int[] x = new int[5];
		x[3] = 12;
		x[4] = 33;
		x[2] = 11;
		for (int temp2 : x){
			System.out.println(temp2);
		}
		System.out.println("----------------");
		String[] stx = new String[5];
		stx[2] = "Ten";
		stx[3] = "Twelve";
		for(String temp3 : stx){
			System.out.println(temp3);	
		}
		

	}

}
