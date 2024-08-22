package hw2;

public class hw5 {
	public static void main(String[] args) {
		int x = 0;
		A: while (x < 49) {
			x++;
			if (x % 10 == 4) {
				continue A;
			}
			if (x / 10 == 4) {
				continue A;
			}
			System.out.println(x);
		}
	}
}