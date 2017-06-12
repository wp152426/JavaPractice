package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MelonGenreChart {

	public static void main(String[] args) {
		List<Music> bList = new ArrayList<>();
		List<Music> dList = new ArrayList<>();
		Map<String, List<Music>> map = new HashMap<>();
		bList.add(new Music("팔레트", "IU"));
		dList.add(new Music("I LUV IT", "PSY"));
		dList.add(new Music("맞지?", "언니쓰"));
		
		map.put("발라드", bList);
		map.put("댄스", dList);
		
		System.out.println(" -- << 멜론 장르별 차트 >> --");
		printMap(map);
		
		System.out.println(" -- << 댄스 2위 곡 변경 >> --");
		dList.add(1, new Music("SIGNAL", "트와이스:"));
		map.put("댄스", dList);
		printMap(map);
		
		System.out.println(" -- << 댄스 1위 곡 삭제 >> --");
		dList.remove(0);
		map.put("댄스", dList);
		printMap(map);
		
		System.out.println(" -- << 전체 리스트 삭제 >> --");
		map.clear();
		printMap(map);
		
	}
	
	public static void printMap(Map<String, List<Music>> map){
		for(String key : map.keySet()){
			System.out.println("[ " + key + " ]");
			int i = 1;
			for(Music m : map.get(key)){
				System.out.println(i++ +". " + m);
			}
		}
		System.out.println();
	}

}
