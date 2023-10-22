package n2ex03;

public class N2ex03 {

	public static void main(String[] args) {
		Operation sum = (x, y) -> x + y;
		Operation substraction = (x, y) -> x - y;
		Operation multiplication = (x, y) -> x * y;
		Operation division = (x, y) -> x / y;

		float sumResult = sum.operation(20.6f,3.3f);
		float subsResult = substraction.operation(20.6f,3.3f);
		float multiResult = multiplication.operation(20.6f,3.3f);
		float divisionResult = division.operation(20.6f,3.3f);
		
		System.out.println("sum = "+sumResult);
		System.out.println("substraction = "+subsResult);
		System.out.println("multpilication = "+multiResult);
		System.out.println("division = "+divisionResult);
	}

}
