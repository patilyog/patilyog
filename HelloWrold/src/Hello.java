
public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Worlds");
		test1 a=new test1();
		//a.show();
}
}
class test1 {
	test1(){
		System.out.println("Contructor called");
	}
	void show() {
	int a=10;
	int b=20;
	//float x=1.9;
	int c=a + b ;
	int d=a -b ;
	float e=a*b;
	int f=a/b;
	System.out.println("Addition of 2 nos is : "+ c);
	System.out.println("Subtraction of 2 nos is "+ d);
	System.out.println("Multiplication of 2 nos is "+ e);
	System.out.println("Division of 2 nos is "+ f);

	}
	class test2 {
		test1(){
			System.out.println("Contructor called");
		}
		void show1() {
		int a=10;
		int b=20;
		//float x=1.9;
		int c=a + b ;
		int d=a -b ;
		float e=a*b;
		int f=a/b;
		System.out.println("Addition of 2 nos is : "+ c);
		System.out.println("Subtraction of 2 nos is "+ d);
		System.out.println("Multiplication of 2 nos is "+ e);
		System.out.println("Division of 2 nos is "+ f);

		}
}