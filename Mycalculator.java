package Week2.Day2_ReturnStatement1;

public class Mycalculator {

	public static void main(String[] args) {

		Calculator c=new Calculator();
		System.out.println(c.add(2,3));
		int subtraction = c.sub(5,6);
		System.out.println(subtraction);
		System.out.println(c.mul(10,45));
		System.out.println(c.div(10,5));
		
		
	}

}
