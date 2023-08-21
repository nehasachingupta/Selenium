package week1.day2;

public class Calculator {
	private int addTwoNumber(int num1, int num2)
	{
		return num1+num2;
	}
	public double mul(double num1, int num2)
	{
		return num1*num2;
	}
	public void sub()
	{
		int num1=100;
		int num2=200;
		System.out.println(num2-num1);
	}
	
	public static void main(String[] args) {
		
		Calculator cal=new Calculator();
		System.out.println(cal.addTwoNumber(100, 200));
		System.out.println(cal.mul(50.5, 10));
		cal.sub();
		
}
}