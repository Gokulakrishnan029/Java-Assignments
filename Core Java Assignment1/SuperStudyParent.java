package CoreJavaAssignment;

public class SuperStudyParent {
	public void X() {
		System.out.println("I am in SuperStudy.X()"); 
		}
	public static void main(String[] args) {
		SuperStudyChild ssc = new SuperStudyChild();
		ssc.X();
		}
	}