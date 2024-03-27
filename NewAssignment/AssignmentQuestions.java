package assignment;

public class AssignmentQuestions {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Able was I ere I saw Elba.");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println("****************************");
		String hannah = "Did Hannah see bees? Hannah did.";
		System.out.println(hannah.length());
		System.out.println(hannah.charAt(12));
		System.out.println(hannah.indexOf("b"));
//		System.out.println(hannah.substring(15,16));
		StringBuffer sb1 = new StringBuffer("Was it a car or a cat I saw?");
		
	}

}
