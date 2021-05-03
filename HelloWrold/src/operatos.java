
public class operatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loops a=new loops();
		a.check();
	}

}
class loops{
	int a=12;
	int b=20;
	void check() {
	if (a>b) {
		System.out.println("a is greater than b");
	}
	else {
			System.out.println("b is greater than a");
		}
	}
}
