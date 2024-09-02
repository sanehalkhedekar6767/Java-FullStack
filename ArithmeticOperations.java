public class ArithmeticOperations {
	int a = 10;
	int b = 3;
	public void add() {
		int c = a + b;
		System.out.println("Addition is: " +c);
	}
	public void sub() {
		int d = a - b;
		System.out.println("Subtraction is: " +d);
	}
	public void mul() {
		int e = a * b;
		System.out.println("Multiplication is: " +e);
	}
	public void div() {
		int f = a / b;
		System.out.println("Division is: " +f);
	}

	public void mod() {
		int g = a % b;
		System.out.println("Modulus is: " +g);
	}

	public static void main(String[] args) {
		ArithmeticOperations A = new ArithmeticOperations();
		A.add();
		A.sub();
		A.mul();
		A.div();
		A.mod();
		
		 
		
	}

}
