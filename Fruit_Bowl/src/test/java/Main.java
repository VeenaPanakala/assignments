import java.util.List;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Main {
	
	Fruits apple1,orange1,banana1,orange2,apple2;
	FruitBowl FruitBowl = new FruitBowl();
	
	@BeforeClass
	public void addAllFruits()
	{
		apple1 = new Apples("red");
		apple2 = new Apples("red");
		orange1 = new Oranges("orange");
		orange2 = new Oranges("orange");
		banana1 = new Bananas("yellow");
		
		FruitBowl.addFruits(apple1);
		FruitBowl.addFruits(apple2);
		FruitBowl.addFruits(orange1);
		FruitBowl.addFruits(orange2);
		FruitBowl.addFruits(banana1);
		
		Reporter.log(FruitBowl.getCountofFruits()+"fruits are there in the bowl");
		

  }
	@Test
	public void checkApples() 
	{
		List<Fruits> apples = FruitBowl.getApples();
		Assert.assertTrue(apples.stream().parallel().allMatch(f -> f instanceof Apples));
		Reporter.log("This bowl contains "+apples.size()+" apples");
	}
	
	@Test
	public void checkOranges() 
	{
		List<Fruits> oranges = FruitBowl.getOranges();
		Assert.assertTrue(oranges.stream().parallel().allMatch(f -> f instanceof Oranges));
		Reporter.log("This bowl contains "+oranges.size()+" oranges");
	}
	
	@Test
	public void checkBananas() 
	{
		List<Fruits> bananas = FruitBowl.getBananas();
		Assert.assertTrue(bananas.stream().parallel().allMatch(f -> f instanceof Bananas));
		Reporter.log("This bowl contains "+bananas.size()+" bananas");
	}
}
