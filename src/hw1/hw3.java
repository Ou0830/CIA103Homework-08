package hw1;

public class hw3 {
	public static void main(String[] args) {
		int sec = 256559 % 60;
		int min = (256559 / 60) % 60;
		int hour = (256559 / 3600) % 60;
		int day = (256559 / 86400) % 24;
		System.out.println(day + "天" + hour + "小時" + min + "分鐘" + sec + "秒數");
	}

}
//請由程式算出256559秒為多少天、多少小時、多少分與多少秒