import java.util.Random;

public class PasswordFunction {

	public  void passwordGenerator(int quantity, int size) {
		String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCase = "abcdefghijklmnopqrstuvwxyz";
		String digits = "0123456789";
		String s1 = upperCase + lowerCase + digits;

		
		Random random = new Random();
		
		for(int j=0; j<quantity;j++) {
			String pwd = "";
			int position1 = random.nextInt(25);
			int position2 = random.nextInt(25);
			int position3 = random.nextInt(9);
			pwd = pwd + upperCase.charAt(position1) + lowerCase.charAt(position2) + digits.charAt(position3);

		for (int i = 0; i <size; i++) {
			int next = random.nextInt(61);
			pwd = pwd + s1.charAt(next);
		}
		System.out.println(pwd);

		}
	}
}
