package week1.day2.assignments;

public class MyCalculator {

	public static void main(String[] args) {
		
		Calculator cal=new Calculator();
		
		int add=cal.add(9, 6, 3);
		System.out.println("Add: "+add);
		int sub=cal.sub(9, 6);
		System.out.println("sub: "+sub);
		double product=cal.product(56.4567, 3435.546);
		System.out.println("product: "+product);
		float div=cal.divide(3.234f, 2.345f);
		System.out.println("div:"+div);
		

	}

}
