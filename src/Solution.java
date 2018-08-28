abstract class Animal {
    protected boolean isMammal;
    protected boolean isCarnivorous;
    
    public Animal(boolean isMammal, boolean isCarnivorous) {
        this.isMammal = isMammal;
        this.isCarnivorous = isCarnivorous;
    }
    
    public boolean getIsMammal() {
        return this.isMammal;
    }
    
    public boolean getIsCarnivorous() {
        return this.isCarnivorous;
    }
    
    abstract public String getGreeting();
    
    public void printAnimal(String name) {
        System.out.println( 
        	"A " + name + " says '" + this.getGreeting() 
            + "', is " + (this.getIsCarnivorous() ? "" : "not ") 
        	+ "carnivorous, and is " + (this.getIsMammal() ? "" : "not ") + "a mammal."
        );
    }
}

//Write your code here. Do not use a 'public' access modifier in your class declaration.

/**
*   Dog class
**/

class Dog extends Animal {
	public Dog() {
		super(true, true);
	}
	public String getGreeting() {
		return "ruff";
	}
	
}

/**
*   Cow class
**/
class Cow extends Animal{

	public Cow() {
		super(true, false);
	}
	public String getGreeting() {
		return "moo";
	}
}

/**
*   Duck class
**/
class Duck extends Animal{

	public Duck() {
		super(false,false);
	}

	public String getGreeting() {
		return "quack";
	}
	
}


public class Solution {
    
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.printAnimal("dog");
        	
        Animal cow = new Cow();
        cow.printAnimal("cow");

        Animal duck = new Duck();
        duck.printAnimal("duck");
    }
}
