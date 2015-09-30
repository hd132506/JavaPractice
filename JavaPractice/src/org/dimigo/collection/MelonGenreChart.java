package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MelonGenreChart {

	public static void main(String[] args) {
		Map<String,List<Music>> music = new HashMap<String,List<Music>>();
		List<Music> ballad = new ArrayList<Music>();
		ballad.add(new Music("내 첫사랑","베리굿"));
		ballad.add(new Music("또 다시 사랑","임창정"));
		ballad.add(new Music("부산에 가면","박진영"));
		
		List<Music> dance = new ArrayList<Music>();
		dance.add(new Music("커피","유재환,김예림"));
		dance.add(new Music("다 잘 될 거야","쿨"));
		
		music.put("발라드", ballad);
		music.put("댄스", dance);
		System.out.println("-----------<<멜론 장르별 차트>>---------");
		printMap(music);
		
		System.out.println("-----------<<발라드 3위 곡 변경>>-------");
		ballad.set(2,new Music("지우고 지워도","차수경"));
		music.put("발라드", ballad);
		printMap(music);
		
		System.out.println("-----------<<발라드 1위 곡 삭제>>-------");
		ballad.remove(0);
		music.put("발라드",ballad);
		printMap(music);
		
		System.out.println("-----------<<전체 리스트 삭제>>-------");
		music.clear();
		 //시험범위
		//상속1 (17p~) 6  
	}
	
	public static void printMap(Map map) {
		

		Map<String,List<Music>> m = map;
		for(String s : m.keySet()) {
			int i=1;
			System.out.println("["+s+"]");
			for(Music m1 : m.get(s)) {
				System.out.println((i++) + ". " + m1.toString());
			}
		}
	}

}
