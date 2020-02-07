
public class StaticTest {

	static int scount;
	int count;
	
	static void go() {
		System.out.println("gogogo~~~~~");
	}
	
	public static void main(String[] args) {
		
		System.out.println(scount);
		
		
		
		/*StaticTest s1 = new StaticTest();
		StaticTest s2 = new StaticTest();
		StaticTest s3 = new StaticTest();
		
		System.out.println(++s1.count + "--" + ++s2.count + "--" + ++s3.count);
		System.out.println(++s1.scount + "--" + ++s2.scount + "--" + ++s3.scount);*/
		
	}
	static {
		System.out.println("static block-2");
		
	}

}
