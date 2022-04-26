package a1_VariableTest;

public class A4_SampleStaticVariableTest extends A3_StaticVariableTest {

	public static void main(String[] args) {

		int c = a + b;
	//	int d= A3_StaticVariableTest.a+A3_StaticVariableTest.b; - if we not extend the class we can call the variable using class name
		System.out.println(c);
	//	System.out.println(d);
	}

}
