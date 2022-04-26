package a1_VariableTest;

public class A1_LocalVariableTest {

	public static void main(String[] args) {
		add();
		sub();
	}

	public static void add()  {

		int i = 5; // local variable
		int j = 5;
		int k = i + j;
		System.out.println(k);
	}

	public static void sub() {

		int i = 5;
		int j = 5;
		int k = i - j;
		System.out.println(k);

	}
}
