package algo_basic.day1;

import java.util.Scanner;

public class SWEA_1289_D3_원재의메모리복구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		sc = new Scanner(src);
		
		int TC = sc.nextInt();
		//int a = Integer.parseInt("4");
		//System.out.println(a);
		for(int i=1; i<=TC; i++) {
			sb.append("#").append(i).append(" ");
			
			String data = sc.next();
			//System.out.println(data.length());
			//System.out.println(data.substring(0));
			
			int cnt=0;
			
			int total = 0;
			
			for(int j=0; j<data.length(); j++) {
				total += Character.getNumericValue(data.charAt(j));
			}
			
//			System.out.println(data.substring(6,7));
			if(total !=0 ) {
				for(int k=0; k<data.length()-1; k++) {
					if(!data.substring(k,k+1).equals(data.substring(k+1,k+2)))
					{
						if(data.charAt(k)=='0') {
							data.charAt(k) = '1';
						}
					
					}
					
					
				}
			}
			
			sb.append(cnt).append("\n");
			
			
			
			
		}
		
		
		/*for(int i=1; i<=TC; i++) {
			sb.append("#").append(i).append(" ");
			
			int data = sc.nextInt();
			int cnt=0;
			int pre=-1;

			if(data !=0  ) {
				while(data!=0) {
					if(pre != -1 && pre != data%10)
					{
						cnt++;
					}
					pre = data%10;
					data = data/10;				
				}
				cnt++;
			}
						
			sb.append(cnt).append("\n");

		}	*/

		System.out.println(sb);	
	
	}
	
	
	private static String src= "2\r\n" + 
			"0011\r\n"+
			"100\r\n";

}
