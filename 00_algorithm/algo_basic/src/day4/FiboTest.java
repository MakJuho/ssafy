package day4;

public class FiboTest {

	public static void main(String[] args) {
		// fibo(10)을 구해보자
		System.out.println(fibo(10));
	}
	
	private static int fibo(int num) {
		if(num < 2) {
			return 1;
		}else
		{
			return num+ fibo(num-1);
		}	
	}

}
