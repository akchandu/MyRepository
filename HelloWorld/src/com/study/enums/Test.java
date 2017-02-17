package com.study.enums;
import static com.study.enums.Color.*;
import com.study.enums.Color;

public class Test {
enum Fish {
		FO,RC;
	}
	public static void main(String[] args) {
		Color c2 = Color.RED;
		System.out.println("ordinal of Green is : " + c2.ordinal());
		Color [] c = Color.values();
		for (Color c1 : c) {
			c1.colorType();
		}
		System.out.println(BLUE);
		
		switch (c2) {
		case RED : System.out.println("Red color");break;
		case GREEN : System.out.println("Green color");break;
		case BLUE : System.out.println("Blue color");break;
		}
	}
	
	
}
