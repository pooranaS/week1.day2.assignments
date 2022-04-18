package week1.day2;

public class LearnMethods {

	public static void main(String[] args) {

		LearnMethods lm = new LearnMethods();

		lm.printCarName();

		int reg = lm.carRegNum();
		System.out.println("Reg no.:" + reg);

		String variant = lm.carVariant();
		System.out.println("variant tytpe:" + variant);

		int product = lm.mulTwoNum(3, 6);
		System.out.println("product:" + product);

	}

	public void printCarName() {
		System.out.println("Swift");
	}

	public int carRegNum() {
		int regNum = 3027;
		return regNum;
	}

	public String carVariant() {
		return "Gas";
	}

	public int mulTwoNum(int a, int b) {
		return a * b;
	}
}
