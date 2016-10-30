package com.jdojo.binding;

import javafx.beans.property.ReadOnlyProperty;

public class BookPropertyTest {
	public static void main(String[] args) {
		Book book = new Book("Harnessing JavaFX", 9.99, "0123456789");
		
		System.out.println("After creating the Book object...");
		
		printDatails(book.titleProperty());
		printDatails(book.priceProperty());
		printDatails(book.ISBNProperty());
		
		System.out.println("\nAfter changing the Book properties...");
		
		printDatails(book.titleProperty());
		printDatails(book.priceProperty());
		printDatails(book.ISBNProperty());
		
	}
	
	public static void printDatails(ReadOnlyProperty<?> p) {
		String name = p.getName();
		Object value = p.getValue();
		Object bean = p.getBean();
		String beanClassName = (bean == null) ? "null" : bean.getClass().getName();
		String propClassName = p.getClass().getSimpleName();
		
		System.out.print(propClassName);
		System.out.print("[Name:" + name);
		System.out.print(", Bean Class:" + beanClassName);
		System.out.println(", Value:" + value + "]");
	}
}
