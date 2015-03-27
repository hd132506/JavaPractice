package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		int distance = 10; //거리
		int halz = (distance-1)/10; //거리에 따른 할증값
		String KindOfCar = "고속버스"; //차 종류
		int pay; 
		
		if(KindOfCar=="고속버스") pay = 850; //pay의 초기값 : 차종에 따른 기본요금
		else if(KindOfCar=="경차") pay = 300;
		else pay = 600;
		
		if(KindOfCar=="고속버스") //pay값에 거리에 따른 할증요금 계산하여 추가
			pay = pay + (halz*300);
		else
			pay = pay + (halz*200); 
		System.out.println("<<고속도로 통행료 계산");
		System.out.printf("거리 : %dkm\n",distance);
		System.out.printf("차량 : %s\n",KindOfCar);
		System.out.printf("통행료 : %d원",pay);
	}

}