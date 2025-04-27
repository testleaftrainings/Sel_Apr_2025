package week1.day2;

public class LearnSwitchCase {

	public static void main(String[] args) {
		String browser="Edge";
		switch (browser) {
		case "Chrome":
			System.out.println("open my chrome browser");
			break;
		case "Edge":
			System.out.println("open my edge browser");
			break;
		case "Safari":
			System.out.println("open my safari browser");
			break;
			default:
				System.out.println("open IE");
			
			
		}
	}

}
