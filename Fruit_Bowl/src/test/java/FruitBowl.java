import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class FruitBowl {
	
	List<Fruits> fruits;
    FruitBowl()
    {
    	fruits=new ArrayList<Fruits>();
    }
    
    public void addFruits(Fruits fruit)
    {
    	fruits.addAll(Arrays.asList(fruit));
    }
    
    public void RemoveFruits(Fruits fruit)
    {
    	fruits.removeAll(Arrays.asList(fruit));
    }
    
    public int getCountofFruits()
    {
    	return fruits.size();
    }
    
    public List<Fruits> getApples()
    {
		ArrayList<Fruits> apples = new ArrayList<Fruits>();
    	
		for(Fruits f : fruits)
		{
			if(f instanceof Apples)
			{
				apples.add(f);
			}
		}
		return apples;
    }
    
    public List<Fruits> getBananas()
    {
		ArrayList<Fruits> bananas = new ArrayList<Fruits>();
    	
		for(Fruits f : fruits)
		{
			if(f instanceof Bananas)
			{
				bananas.add(f);
			}
		}
		return bananas;
    }
    
    public List<Fruits> getOranges()
    {
		ArrayList<Fruits> oranges = new ArrayList<Fruits>();
    	
		for(Fruits f : fruits)
		{
			if(f instanceof Oranges)
			{
				oranges.add(f);
			}
		}
		return oranges;
    }
}
