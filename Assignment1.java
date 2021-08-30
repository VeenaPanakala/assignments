public class FruitBowl {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] FB = MixedBowl();
		String Bowl1 = FB[0];
		String Bowl2 = FB[1];
		String Bowl3 = FB[2];
		System.out.println("Bowl 1 contains: " +Bowl1);
		System.out.println("Bowl 2 contains: " +Bowl2);
		System.out.println("Bowl 3 contains: " +Bowl3);
	}

	private static String[] MixedBowl() {
		// TODO Auto-generated method stub
		String[] bowl = {"Apples","Oranges","Bananas"};
		
		return bowl;
	}

}
