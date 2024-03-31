package coreJava2;

public class InstanceOfAandB {

	public int a, b;
	public int c = 2;
	public static int x = 6;

	public static void main(String[] args) {
		InstanceOfAandB instanceA = new InstanceOfAandB();
		InstanceOfAandB instanceB = new InstanceOfAandB();
		instanceA.a = 8;
		instanceB.b = instanceA.x;
		instanceA.x++;
		instanceB.a = 10;
		instanceB.c = 90;
		instanceB.x++;
		// prints value w.r.t instance A
		System.out.print(instanceA.a + ",");
		System.out.print(instanceA.b + ",");
		System.out.print(instanceA.c + ",");
		System.out.print(instanceA.x + ",");
		// prints value w.r.t instance B
		System.out.println();
		System.out.print(instanceB.a + ",");
		System.out.print(instanceB.b + ",");
		System.out.print(instanceB.c + ",");
		System.out.print(instanceB.x + ",");
	}
}
