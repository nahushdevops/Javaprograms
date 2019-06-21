package test2.exercises;

public class TestEmployee {

	public static void main(String[] args) {
	/*	
		Employee alex , linda , john;
		alex = new Employee();
		linda = new Employee();
		John = new Employee();*/
	Employee alex = new Employee();
	Employee linda = new Employee();
	Employee John = new Employee();
	alex.salary = 20000;
	alex.bonus = 1000;
	alex.calculateTotalPay();
	linda.salary = 30000;
	linda.bonus = 2000;
	linda.calculateTotalPay();
	John.salary = 40000;
	John.bonus = 3000;
	John.calculateTotalPay();
	
		}

}
