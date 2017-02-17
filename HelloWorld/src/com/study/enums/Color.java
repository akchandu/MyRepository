package com.study.enums;

public enum Color {
	BLUE,RED {
		public void colorType() {
			System.out.println("dangerous color");
		}
	},GREEN;
	public void colorType() {
		System.out.println("normal color");
	}
	Color() {
		System.out.println("enum constructor");
	}
}
