package javaBasics.newPacakage;

public class Addition {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Addition add = new Addition();

		add.firstmethod();

		secondmethod();

		add.thirdmethod();

		add.fourthmethod();

		add.fifthmethod();

		add.sixthmethod();

		add.sevenmethod();

		eigthmethod(4.3, 5.3);

		eigthmethod(5, 5);

		int a = 20;
		int b = 15;

		int sub = add.ninthmethod(a, b);

		System.out.println("We are subtracting " + a + " and " + b + " = " + sub);

	}

	public void firstmethod() {

		System.out.println("1");
	}

	static void secondmethod() {

		System.out.println("2");
	}

	private void thirdmethod() {

		System.out.println("3");

	}

	protected void fourthmethod() {

		System.out.println("4");
	}

	public int fifthmethod() {

		System.out.println("5");
		return 0;
	}

	public String sixthmethod() {

		System.out.println("6");
		return null;
	}

	public boolean sevenmethod() {

		System.out.println("7");
		return false;
	}

	public static void eigthmethod(int x, int y) {

		int z = x + y;
		System.out.println("Addition int value =" + z);
	}

	public static void eigthmethod(double x, double y) {

		double z = x + y;
		System.out.println("Addition double value =" + z);
	}

	public int ninthmethod(int x, int y) {

		return x - y;
	}

}
