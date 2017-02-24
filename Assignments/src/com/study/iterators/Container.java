package com.study.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Container<T> {

	private List<T> container;
	
	public Container() {
		container = new ArrayList<T>();
	}
	
	public void add(T data) {
		container.add(data);
	}
	
	public int size() {
		return container.size();
	}
	
	public Iterator<T> iterator(){
		return new MyIterator<T>();
	}
	
	@SuppressWarnings("unchecked")
	public Iterator<T> inorderIterator() {
		return new InorderIterator<T>();
	}
	
	public String toString() {
		return container.toString();
	}
	
	
	public class MyIterator<T> implements Iterator<T> {
		
		private int index;
		
		public MyIterator() {
			index = 0;
		}

		@Override
		public boolean hasNext() {
			return (index < container.size());
		}

		@SuppressWarnings("unchecked")
		@Override
		public T next() {
			return (T) container.get(index++);
		}

		@Override
		public void remove() {
			if (index >= 0) {
				container.remove(index);
			}
			index --;
		}
	}
	
	public class InorderIterator<T> implements Iterator<T> {
		int index;
		private TreeOperations<T> obj;
		private MyIterator myiterator;
		
		public InorderIterator() {
			index = 0;
			obj = new TreeOperations<T>();
			myiterator = new MyIterator();
		}

		@Override
		public boolean hasNext() {
			return (index < container.size());
		}

		@Override
		public T next() {
			obj.insertContainerInTree(container);
			List<T> l = obj.getInorder();
			return l.get(index++);
		}

		@Override
		public void remove() {
			//System.out.println("not yet implemented");
			myiterator.remove();
		}
		
	}
	
}
