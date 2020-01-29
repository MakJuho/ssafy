package com.array;

public class ArrayTest {

	static int N;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]data={
			{1,2,3,4,5},
			{1,2,3,4,5},
			{1,2,3,4,5},
			{1,2,3,4,5},
			{1,2,3,4,5}
		};
			
		N=data.length;
		
//		int[] dx = {-1,1,0,0}; // 상하좌우 x좌표값
//		int[] dy = {0,0,-1,1}; // 상하좌우 y좌표값
		
		int[] dx = {0,-1,0,1}; // 우상좌하 x좌표값
		int[] dy = {1,0,-1,0}; // 우상좌하 y좌표값
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				
				int v = data[i][j];
				int sum = 0;
				
				for(int k=0; k<4; k++) {
					int nx = i+dx[k];
					int ny = j+dy[k];
					
					if(isInRange(nx, ny)) {
						//sum
						sum += data[nx][ny];
					
					}
				}
				System.out.print(sum+ "\t");
			}
			System.out.println();
		}
	}

	private static boolean isInRange(int nx, int ny) {
		
		if( nx>=0 && ny>=0 && nx< N && ny < N)
			return true;
		
		return false;
	}

}
