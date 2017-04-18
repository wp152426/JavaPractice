package org.dimigo.oop;

public class PiggyBankTest {

	public static void main(String[] args) {
		FamilyMember fm1 = new FamilyMember("Dad");
		FamilyMember fm2 = new FamilyMember("Mom");
		FamilyMember fm3 = new FamilyMember("Me");
		FamilyMember fm4 = new FamilyMember("Brother");
		
		FamilyMember.printMemberCnt();
		
		PiggyBank.putMoney(fm1, 10000);
		PiggyBank.putMoney(fm2, 5000);
		PiggyBank.putMoney(fm3, 2000);
		PiggyBank.putMoney(fm4, 1000);
		
		PiggyBank.printBalance();
		
		PiggyBank.putMoney(fm3, 1000);
		
		PiggyBank.printBalance();
	}

}
