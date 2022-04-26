package a1_VariableTest;

public class A5_InstanceVariableTest {
	
	public int i=8;
	public int j=3;
	
	public static void main(String[] args) {
		
		A5_InstanceVariableTest o=new A5_InstanceVariableTest();
		int k=o.i+o.j;
		System.out.println(k);
		
		
	}

}
