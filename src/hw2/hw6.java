package hw2;

public class hw6 {
	public static void main(String[] args) {
		// 外層循環控制行數
		for (int i = 10; i >= 1; i--) {
			// 內層循環控制每一行的數字輸出
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			// 換行
			System.out.println();
		}
	}
}