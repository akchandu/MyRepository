package com.study;

public class InitializerBlock {
	
	{
		System.out.println("Initializer block called");
	}
	
	int i;
	int j;
	String str;
	
	public InitializerBlock() {
		
	}
	
	public InitializerBlock(int i, int j, String str) {
		this.i = i;
		this.j = j;
		this.str = str;
				
	}
	
	public static void main(String[] args) {
		InitializerBlock obj1 = new InitializerBlock();
		InitializerBlock obj2 = new InitializerBlock(1, 2, "abc");

	}

}
