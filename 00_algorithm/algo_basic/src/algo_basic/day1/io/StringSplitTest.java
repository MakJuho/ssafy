package algo_basic.day1.io;

public class StringSplitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		split1();
		split3();
	}
	public static void split1() {
		String src = "10, 20, 30";
		String[] splited = src.split(",");
		
		int sum =0;
		for(int i=0; i<splited.length; i++) {
			sum += Integer.parseInt(splited[i]);
		}
		System.out.println(sum);
	}

	private static void split3() {
		String src = "이름:홍길동,Java:100,HTML:80,Script:85";
		String[] splited2= {};

		String[] splited = src.split(":|,");
		String name = splited[1];
		
		int sum=0;

		for(int i=3; i<splited.length; i=i+2) {
			sum +=Integer.parseInt(splited[i]);
		}
		System.out.printf("%s %d",name,sum);
	}
}
