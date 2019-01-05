package misc;

class Base {
	private static void display() {
		System.out.println("Static or class method from misc.Base");
	}

	public void print() {
		System.out.println("Non-static or instance method from misc.Base");
	}
}

class Derived extends Base {
	private static void display() {
		System.out.println("Static or class method from misc.Derived");
	}

	public void print() {
		System.out.println("Non-static or instance method from misc.Derived");
	}
}

public class TestBase {
	public static void main(String args[]) {
		Base obj = new Derived();
//		obj.display();
		obj.print();
	}
}
