package org.dimigo.collection;

import java.util.ArrayList;
import java.util.List;

public class MelonChart {

	public static void main(String[] args) {
		List<Music> musics = new ArrayList<Music>();
		musics.add(new Music("바람이나 좀 쐐","개리"));
		musics.add(new Music("보통연애","박경"));
		musics.add(new Music("취향저격","iKON"));
		
		System.out.println("--<<멜론 차트>>--");
		printList(musics);
		
		System.out.println("--<<2위 곡 추가>>--");
		musics.add(1, new Music("레옹","이유갓지"));
		printList(musics);
		
		System.out.println("--<<3위 곡 변경>>--");
		musics.set(2, new Music("맙소사","황태지"));
		printList(musics);
		
		System.out.println("--<<4위 곡 삭제>>--");
		musics.remove(3);
		printList(musics);
		
		System.out.println("--<<전체 리스트 삭제>>--");
		musics.clear();
		printList(musics);
	}
	
	public static void printList(List<Music> list) {
		int i=1;
		for(Music m: list)
			System.out.println((i++) + ". " + m.toString());
		System.out.println();
	}
}
