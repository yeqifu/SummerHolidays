package Example0621;

public class Demo03 {
	public static void main(String[] args) {
		int y=3;
		switch(y) {
		default:
			y++;
			break;
		case 3:
			y++;
		case 4:
			y++;
		
		}
		System.out.println("y="+y);
	}
}
