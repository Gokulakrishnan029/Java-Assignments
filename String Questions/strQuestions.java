package StringQuestion;

public class strQuestions {

	public static void main(String[] args) {
		// Question1
		StringBuffer sb = new StringBuffer("Able was I ere I saw Elba.");
		System.out.println("Initial capacity will be " + sb.capacity());
		// Question2
		String hannah = "Did Hannah see bees? Hannah did.";
		System.out.println("Length of the String is " + hannah.length());
		System.out.println("In this Sentence 'Did Hannah see bees? Hannah did.' at 12-th position we have " + "'"
				+ hannah.charAt(12) + "'");
		System.out.println("The letter 'b' in String is at index number " + hannah.indexOf('b'));
		// Question3
		String object = "Was it a car or a cat I saw?";
		System.out.println("what i saw was a " + object.substring(9, 12));
	}
}
