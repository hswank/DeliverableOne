import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		boolean flag = false;
		Scanner input = new Scanner(System.in);
		
		while (flag != true) {
			System.out.print("Please create a password: ");
			String password = input.nextLine();
			
			if (password != password.toUpperCase()) {
				if (password != password.toLowerCase()) {
					if (password.length() >= 7) {
						if (password.length() <= 12) {
							if (password.indexOf('!') >= 0) {
								System.out.println("Password valid and accepted.");
								flag = true;
							} else {
								System.out.println("Error.  Must contain '!'");
							}
						} else {
							System.out.println("Error. There needs to be 12 or less characters.");
						}
					} else {
						System.out.println("Error.  There needs to be 7 or more characters");
					}
				} else {
					System.out.println("Error. There needs to be an uppercase letter.");
				}
			} else {
				System.out.println("Error. There needs to be a lowercase letter.");
			}
			
		}
		input.close();
	}
	

}