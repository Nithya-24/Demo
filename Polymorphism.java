package array;

public class Polymorphism {

	public void displayInfo() {
	    System.out.println("Common English Language");
	  }
	}

	class Java extends Polymorphism {
	  @Override
	  public void displayInfo() {
	    System.out.println("Java Programming Language");
	  }
	}

