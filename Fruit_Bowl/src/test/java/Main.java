import org.testng.annotations.Test;

public class Main {
  @Test
  public void segregate() {
	  
	  FruitBowl FruitBowl = new FruitBowl();
	  Bowl1 Bowl1 = new Bowl1();
	  Bowl2 Bowl2 = new Bowl2();
	  Bowl3 Bowl3 = new Bowl3();
	  
	  FruitBowl.mixedFruits();
	  Bowl1.Oranges();
	  Bowl2.Apples();
	  Bowl3.Bananas();

  }
}
