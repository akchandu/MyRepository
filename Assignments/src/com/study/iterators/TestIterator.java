package com.study.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		//System.out.println("list [BEFORE] is : " + list);
		for (Iterator<Integer> it = list.iterator(); it.hasNext();) {
			System.out.print(it.next() + " ");
			//it.remove();
		}
		/*Iterator<Integer> it1 = list.iterator();
		it1.remove();*/
		System.out.println();
		//System.out.println("list [AFTER] is : " + list);
		System.out.println();
		
		Container<Integer> container = new Container<Integer>();
		//{50, 17, 72, 12, 23, 54, 76, 9, 14, 19, 67};
		container.add(50);
		container.add(17);
		container.add(72);
		container.add(12);
		container.add(23);
		container.add(54);
		container.add(76);
		container.add(9);
		container.add(14);
		container.add(19);
		container.add(67);
		
		//System.out.println(container.size());
		System.out.println(container);
		
		System.out.println("Regular iterator");
		for (Iterator<Integer> it = container.iterator(); it.hasNext();) {
			System.out.print(it.next() + " ");
			//it.remove();
		}
		System.out.println();
		
		System.out.println("Inorder iterator");
		for (Iterator<Integer> it = container.inorderIterator(); it.hasNext();) {
			System.out.print(it.next() + " ");
		}

	}

}
