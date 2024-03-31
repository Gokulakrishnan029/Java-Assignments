package CoreJavaAssignment;

class SuperStudyChild extends SuperStudyParent {
	public void X() {
		//without super key word there occurs a stack overflow exception
		super.X();
		System.out.println("I am in SuperStudyChild.X()");
		}
	}