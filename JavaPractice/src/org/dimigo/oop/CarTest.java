/**
 * 
 */
package org.dimigo.oop;

public class CarTest {

	public static void main(String[] args) {
//		Car car = new Car();
//		Car car2 = new Car();
//		Car car3 = new Car();
//		car.setCompany("현대자동차");
//		car.setModel("제네시스");
//		car.setColor("검정색");
//		car.setMaxSpeed(225);
//		car.setPrice(50000000);
//		
//		car2.setCompany("기아자동차");
//		car2.setModel("K7");
//		car2.setColor("흰색");
//		car2.setMaxSpeed(246);
//		car2.setPrice(40000000);
//
//		car3.setCompany("삼성자동차");
//		car3.setModel("SM7");
//		car3.setColor("회색");
//		car3.setMaxSpeed(200);
//		car3.setPrice(38000000);
//		
//		System.out.println("<<자동차 목록>>");
//		System.out.println("제조사명 : "+car.getCompany());
//		System.out.println("모델명 : "+car.getmodel());
//		System.out.println("색상 : "+car.getColor());
//		System.out.println("최대속도 : "+car.getMaxSpeed()+"km");
//		System.out.println("가격 : "+String.format("%,d원", car.getPrice()));
//		
//		System.out.println();
//		
//		System.out.println("제조사명 : "+car2.getCompany());
//		System.out.println("모델명 : "+car2.getmodel());
//		System.out.println("색상 : "+car2.getColor());
//		System.out.println("최대속도 : "+car2.getMaxSpeed()+"km");
//		System.out.println("가격 : "+String.format("%,d원", car2.getPrice()));
//		
//		System.out.println();
//		
//		System.out.println("제조사명 : "+car3.getCompany());
//		System.out.println("모델명 : "+car3.getmodel());
//		System.out.println("색상 : "+car3.getColor());
//		System.out.println("최대속도 : "+car3.getMaxSpeed()+"km");
//		System.out.println("가격 : "+String.format("%,d원", car3.getPrice()));
		
		Car2 car = new Car2("현대자동차", "제네시스", "검정색",225,50000000);
		Car2 car2 = new Car2("기아자동차", "K7", "흰색",246,40000000);
		Car2 car3 = new Car2("삼성자동차", "SM7", "회색",200,38000000);
		
		System.out.println("<<자동차 목록>>");
		System.out.println("제조사명 : "+car.getCompany());
		System.out.println("모델명 : "+car.getmodel());
		System.out.println("색상 : "+car.getColor());
		System.out.println("최대속도 : "+car.getMaxSpeed()+"km");
		System.out.println("가격 : "+String.format("%,d원", car.getPrice()));
		
		System.out.println();
		
		System.out.println("제조사명 : "+car2.getCompany());
		System.out.println("모델명 : "+car2.getmodel());
		System.out.println("색상 : "+car2.getColor());
		System.out.println("최대속도 : "+car2.getMaxSpeed()+"km");
		System.out.println("가격 : "+String.format("%,d원", car2.getPrice()));
		
		System.out.println();
		
		System.out.println("제조사명 : "+car3.getCompany());
		System.out.println("모델명 : "+car3.getmodel());
		System.out.println("색상 : "+car3.getColor());
		System.out.println("최대속도 : "+car3.getMaxSpeed()+"km");
		System.out.println("가격 : "+String.format("%,d원", car3.getPrice()));
	}

}
