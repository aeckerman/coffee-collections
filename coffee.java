public class coffee {	
	public static int coffee = (int)(Math.random() * 10);
	
	public static void showSupply() {
		System.out.print("*Coffee supply at ");
		System.out.print(coffee); 
		System.out.println(".*");
	}

	public static void goToStarbucks() {
		System.out.println("*Drives all the to Augusta to get frappe.*");
		System.out.println("*Returns from Augusta.*");
	
		coffee += 10;
	
		showSupply();
	}

	public static void codeOn() {
		System.out.println("*Coffee supply all good!*");
		System.out.println("*I can now finish my Petagon database hacker.*");
	
		showSupply();
	}

	public static void main(String[] args) {
		if (coffee <= 5) {
			goToStarbucks();		
		} else {
			codeOn();
		}
	}
}