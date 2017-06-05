
package org.dimigo.collecfkon;

import java.util.ArrayList;
import java.util.List;

public class MelonChart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Music> list = new ArrayList<>();
		
		System.out.println("--<<��� í>>--");
		list.add(new Music("I LUV IT", "PSY"));
		list.add(new Music("����?", "��Ͼ�"));
		printList(list);
		
		System.out.println("--<<2�� �� �߰�>>--");
		list.add(1, new Music("SIGNAL", "Ʈ���̽�:"));
		printList(list);
		
		System.out.println("--<<3�� �� ����>>--");
		list.set(2,  new Music("�ȷ�Ʈ", "Iu"));
		printList(list);
		
		System.out.println("--<<2�� �� ����>>--");
		list.remove(1);
		printList(list);
		
		System.out.println("--<<��ü ����Ʈ ����>>--");
		list.clear();
		printList(list);
	}
	
	public static void printList(List<Music> list){
		int i = 1;
		for(Music m : list){
			System.out.println(i++ + ". " + m);
		}
		System.out.println();
	}
	
}
