package hw1;

public class hw5 {
	public static void main(String[] srg) {
		int x = 1_500_000;
		double y = 1 + 0.02;
		System.out.println("十年後會有" + (int) (x * (Math.pow(y, 10))) + "元");
	}

}
