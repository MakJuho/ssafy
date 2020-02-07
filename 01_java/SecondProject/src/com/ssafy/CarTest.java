package com.ssafy;


public class CarTest {

	public static void main(String[] args) {
		
		//Car s1 = Car.getInstance();
		
		
		CarMgr cm = CarMgr.getinstance();
		
		
		// Car 정보 저장
		cm.add(new Car("2346","A-1",1000000));
		cm.add(new Car("1234","A-2",2000000));
		cm.add(new Car("4567","A-1",3000000));
		cm.add(new Car("1111","B-2",4000000));
		cm.add(new Car("2222","B-1",5184150));
		cm.add(new Car("3333","C-2",3518000));
		
		// 버스 추가
		cm.add(new Bus("7000","D-1",300000000,30));
		cm.add(new Bus("7001","D-2",400000000,40));
		cm.add(new Bus("7002","D-3",500000000,25));
		
		// 트럭 추가
		cm.add(new Truck("10A","E-1",30000000, 10));
		cm.add(new Truck("10B","E-2",50000000, 15));
		
		
		// 모든 차량 검색
		cm.search();
		
		
		// 차량번호로 검색
		cm.search("1111");
		
		// 지정된 가격보다 작은 차량 정보
		cm.search(3000000);
		
		// 차량삭제
		cm.delete("1111");
		
		// 차량 개수
		cm.size();
		
		// 모든 차량의 금액 합
		cm.totalPrice();
		
		
		
		
	}

}
