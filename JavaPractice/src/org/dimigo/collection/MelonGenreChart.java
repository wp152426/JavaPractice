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
		bList.add(new Music("�ȷ�Ʈ", "IU"));
		dList.add(new Music("I LUV IT", "PSY"));
		dList.add(new Music("����?", "��Ͼ�"));
		
		map.put("�߶��", bList);
		map.put("��", dList);
		
		System.out.println(" -- << ��� �帣�� ��Ʈ >> --");
		printMap(map);
		
		System.out.println(" -- << �� 2�� �� ���� >> --");
		dList.add(1, new Music("SIGNAL", "Ʈ���̽�:"));
		map.put("��", dList);
		printMap(map);
		
		System.out.println(" -- << �� 1�� �� ���� >> --");
		dList.remove(0);
		map.put("��", dList);
		printMap(map);
		
		System.out.println(" -- << ��ü ����Ʈ ���� >> --");
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
