package org.dimigo.oop;

public class FamilyMember {
	private static int MemberCnt;
	private String memberName;
	
	public FamilyMember(String memberName) {
		this.memberName = memberName;
		FamilyMember.MemberCnt++;
	}
	
	public String getMemberName() {
		return memberName;
	}
	
	public static void printMemberCnt() {
		System.out.println("가족 총 인원 수 : "+MemberCnt+"명");
	}
	
}
