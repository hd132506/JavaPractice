/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("모든 게 잘 될 (거에요/거예요)");
		String answer = scanner.nextLine();
		if(answer!=null && answer.equals("거예요")) {
			System.out.println("정답");
		} else {
			System.out.println("오답.");
		}
		
		System.out.println("그딴 거 개나 (줘 버려/줘버려)");
		answer = scanner.nextLine();
		if(answer!=null && answer.equals("줘 버려")) {
			System.out.println("정답");
		} else {
			System.out.println("오답.");
		}
		
		System.out.println("제발 (죽지마/죽지 마)");
		answer = scanner.nextLine();
		if(answer!=null && answer.equals("죽지 마")) {
			System.out.println("정답");
		} else {
			System.out.println("오답.");
		}
	}

}
