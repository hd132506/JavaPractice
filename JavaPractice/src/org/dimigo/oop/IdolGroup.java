/**
 * 
 */
package org.dimigo.oop;

public class IdolGroup {

	public static void main(String[] args) {
		String[] idolGroup = new String[] {"빅뱅","2NE1","걸스데이"};
		String[][] members = new String[][] {
				{"gd","태양","ㄷ성","탑","승리"},
				{"cl","산다라박","박봄","민지"},
				{"유라","ㅎ{리","소진","민아"}
		};
		
		for(int i = 0; i <idolGroup.length; i++) {
			System.out.println("<<"+idolGroup[i]+"멤버>>");
			for(int j = 0; j<members[i].length;j++) System.out.println(members[i][j]);
		}
	}

}
