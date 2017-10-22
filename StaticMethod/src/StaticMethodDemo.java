
public class StaticMethodDemo {
	//static method
	public static void MyCalculation(){
		System.out.println("static method mycalculation");
	}
	//static main method 
	public static void main(String[] args) {
		System.out.println("This is a static main method");
		MyCalculation();	
	}
	//this static block
	static{
		System.out.println("This static block");
	}

}
