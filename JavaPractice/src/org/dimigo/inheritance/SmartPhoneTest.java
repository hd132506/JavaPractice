package org.dimigo.inheritance;

public class SmartPhoneTest {

	public static void main(String[] args) {
		SmartPhone iphone = new IPhone("iPhone 6","애플",700000);
		System.out.println(iphone.toString());
		iphone.turnOn();
		iphone.pay();
		iphone.useSpecialFunction();
		iphone.turnOff();
		
		SmartPhone gphone = new Galaxy("갤럭시 S6","삼성",650000);
		System.out.println(gphone.toString());
		gphone.turnOn();
		gphone.pay();
		gphone.useSpecialFunction();
		gphone.turnOff();
	}

}
