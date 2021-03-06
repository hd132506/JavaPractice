package org.dimigo.oop;

public class PiggyBankTest {

	public static void main(String[] args) {
		FamilyMember[] family = {
				new FamilyMember("아빠"),new FamilyMember("엄마"),new FamilyMember("나"),new FamilyMember("동생")
		};
		
		FamilyMember.printMemberCnt();
		PiggyBank.putMoney(family[0], 10000);
		PiggyBank.putMoney(family[1], 5000);
		PiggyBank.putMoney(family[2], 2000);
		PiggyBank.putMoney(family[3], 1000); //static 메소드에서 this 사용 불가
		
		
		
		PiggyBank.printBalance();
		PiggyBank.putMoney(family[2], 1000);
		PiggyBank.printBalance();
	}

}
