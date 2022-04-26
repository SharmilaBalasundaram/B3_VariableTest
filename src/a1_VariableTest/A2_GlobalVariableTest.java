
package a1_VariableTest;

public class A2_GlobalVariableTest {

	public static int i=5;
	public static int j=5;
	
	public static void main(String[] args) {
		
		add();
		sub();
		
		}

	public static void add() {
		int k = i + getJ();
		System.out.println(k);
	}

	public static void sub() {
		int k = i - getJ();
		System.out.println(k);

	}

	public static int getJ() {
		return j;
	}

	public static void setJ(int j) {
		A2_GlobalVariableTest.j = j;
	}

}
