/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;


public class Score {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("국어 점수 입력 =>");
		int kor = scanner.nextInt();
		System.out.printf("수학 점수 입력 =>");
		int math = scanner.nextInt();
		System.out.printf("영어 점수 입력 =>");
		int eng = scanner.nextInt();
		
		String sb = new StringBuilder()
		.append("<<점수 출력>>"+"\n")
		.append("국어점수 : " + kor+"\n")
		.append("수학점수 : " + math+"\n")
		.append("영어점수 : " + eng+"\n")
		.append("총점 : " + (kor+math+eng)+"점"+"\n")
		.append("평균 : " + String.format("%.1f", (kor+math+eng)/3f) + "점").toString();
		System.out.println(sb);
	}

}
