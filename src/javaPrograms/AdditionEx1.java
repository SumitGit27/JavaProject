package javaPrograms;

public class AdditionEx1 {

	public static void main(String[] args) {
		
		System.out.println("Program Starts");
		AdditionEx1 obj = new AdditionEx1();
		obj.addition(80, 80);
		System.out.println("Program Ends");
	}
	
	public void addition(int a, int b) {
		int sum = (byte)(a+b);
		System.out.println("Addition of two veriables= "+sum);
	}
}
