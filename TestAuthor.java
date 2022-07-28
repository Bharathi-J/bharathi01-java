package com.author.demo;

public class TestAuthor {
	public static void main(String[] args) {
		Author a1=new Author("William","Shakespear");
		Author a2=new Author("Bharathi","J");
		System.out.println(a1.getFirstName());
		System.out.println(a1.getLastName());
		System.out.println(a2);
		//Author a3=new Author();
		Author a4;
		a4=a2;
		System.out.println(a4);
	}

}
