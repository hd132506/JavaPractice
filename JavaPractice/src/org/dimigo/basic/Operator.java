package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		double sada=9, sadb=10,sadh=5.8;
		double pya=9, pyh=5.4;
		double sadnulb=(sada+sadb)*sadh/2;
		double pynulb=pya*pyh;
		
		double cha = sadnulb>pynulb ? sadnulb-pynulb : pynulb - sadnulb;
		if(sadnulb - pynulb>0) {
			System.out.printf("사다리꼴이 평행사변형보다 %.1f 더 큽니다.",cha);
		}
		else {
			System.out.printf("평행사변형이 사다리꼴보다 %.1f 더 큽니다.",cha);
		}
	}

}
