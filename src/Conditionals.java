
/*
 * When tester is set to 5, you will get two lines of output.
 * you entered 5
 * you entered 10
 * 
 * The default will not print in this case.
 * 
 */
public class Conditionals {
	private int tester = 5;

	public void trySwitch() {

		switch (tester) {
		case 1:
			System.out.println("you entered 1");
			break;
		case 2:
			System.out.println("you entered 2");
			break;
		case 3:
			System.out.println("you entered 3");
			break;
		case 4:
			System.out.println("you entered 4");
			break;
		case 5:
			System.out.println("you entered 5");
		case 10:
			System.out.println("you entered 10");
			//break;
		default:
			System.out.println("you entered nothing good");

		}
	}

}
