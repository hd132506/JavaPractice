package org.dimigo.basic;

public class TypeCasting {

	public static void main(String[] args) {
		int AMPay = 1700000, NOShop = 1500;
		byte NOClerks = 3;
		long ingeonbi = (long)NOShop*NOClerks*AMPay*12;
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.println("월 평균 급여 : "+String.format("%,d원", AMPay));
		System.out.println("점포 내 직원 수 : "+NOClerks+"명");
		System.out.println("점포 수 : "+String.format("%,d개", NOShop));
		System.out.println("연간 인건비 : "+String.format("%,d원", ingeonbi));
	}

}
