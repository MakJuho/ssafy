package algo_basic.day1.io;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		read0();
//		read1();
		read2();
	}
	
	public static void read0() {
		Scanner scanner = new Scanner(System.in);
		// 다음 문자열 있어 ,  공백 
		while(scanner.hasNext()) {
			// 있으면 가져와봐
			String str = scanner.next();
			System.out.println(str);
		}
	}
	
	public static void read1() {
		String src = "123 + 234";
		
		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(src);
		// 다음 문자열 있어 ,  공백 
		int num1 = scanner.nextInt();
		String oper = scanner.next();
		int num2 = scanner.nextInt();
		System.out.println(num1+num2);
	}

	public static void read2() {
		String src = "100, 200, 300, 400";
		
		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(src);
		scanner.useDelimiter(", ");
		int sum=0;
//		System.out.println(scanner.hasNextInt());
		// 다음 문자열 있어 ,  공백 
		while(scanner.hasNextInt()) {
			sum += scanner.nextInt();
//			System.out.println(scanner);
		}
		System.out.println(sum);
//		int num1 = scanner.nextInt();
//		String oper = scanner.next();
//		int num2 = scanner.nextInt();
//		System.out.println(num1+num2);
	}
	
}
