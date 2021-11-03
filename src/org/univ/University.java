package org.univ;

public class University extends College {
	public void ug() {
		System.out.println("Under Graduate");
	}
	public void pg() {
		System.out.println("Post Graduate");
	}
	public static void main(String[] args) {
		University s=new University();
		s.pg();
		s.ug();
	}


}
