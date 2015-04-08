package org.totalbegginer.tutorial;

public class Person {
	// Fields
	private String name; //name of the person
	private int maximumBooks; //most books the person can check out
	

	// Constructors
	public Person(){
		name = "unknown name";
	    maximumBooks = 3;
	}
	
	// Methods
	public String getName(){
		return name;
	}
	
	public void setName(String anyName) {
		name = anyName;
	}

	public int getMaximumBooks() {
		return maximumBooks;
	}

	public void setMaximumBooks(int maximumBooks) {
		this.maximumBooks = maximumBooks;
	}

	//"getters" = methods to return Class field values
	//"setters" = methods to set Class field values
	
	//Ctrl + space open code helper. After that TAB navigate trough elements.
	
	//Class contains:
	//  1) Fields for data
	//  2) Constructors to create objects
	//  3) Methods, e.g., getters, setters
	//Members = fields and methods of a class
	
	//new / others / Java / Java RunDebug / Scrapbook Page
	
	//Expression = piece of code that evaluates to a single value (e.g., "2+2")
	//Statement = full sentence and ends with semi-colon(;)(e.g.:"a=3;")
	
	//Eclipse scrapbook
	//  - Inspect if for expressions  Ctrl + Shift + I
	//  - Execute is for statements   Ctrl + U
	
	//Java Package
	//You type "Person" ...
	//and the complier sees the full name ("org.totalbeginner.tutorial.Person")
	//Use of Java Packages
	//1.Avoids problem of duplicate Class names.
	//2.If you need a class from another package, import the package.
	
	//Scarpbook page is not inside our package
	// so wee need to add import.
	
	//Set the import declarations for Running Code / Add Packages / Type name
}
