package test;

public class Super {
	public int i = 0;
	Super(){
		//If a constructor does not explicitly invoke a superclass constructor, the Java compiler automatically inserts a call to the no-argument constructor of the superclass. 
		//If the super class does not have a no-argument constructor, you will get a compile-time error. ... call to the parent constructor.
	}
	public Super(String txt) {
		i = 1;
	}
}
