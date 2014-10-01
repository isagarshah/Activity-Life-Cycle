package com.example.k_spinnerlistview;

import java.util.ArrayList;

public class FruitDataList {
	
			//	ArrayList<String> namesLists;  ...............here, object not created
	
	static ArrayList<String> namesList = new ArrayList<String>();   // Already initialized. object of ArrayList is created here. 
	static ArrayList<String> descList = new ArrayList<String>();
	static ArrayList<String> priceList = new ArrayList<String>();
	static ArrayList<Integer> imagesList = new ArrayList<Integer>();
	
	private static void createData() {
		
		// Names of Fruits
		namesList.add("Mango");
		namesList.add("Apple");
		namesList.add("Grapes");
		namesList.add("Orange");
		namesList.add("Guava");
		namesList.add("Avacoda");
		
		// Descriptions of Fruits
		
		descList.add("Mango is Good for Skin");
		descList.add("Apple keeps Dcotor Away");
		descList.add("Grapes are Good for Wine");
		descList.add("Orange is Good for Eyes");
		descList.add("Guava is Good for Vitamin C");
		descList.add("Avacoda is Good for Body");
		
		// Price List
		
		priceList.add("$ 10");
		priceList.add("$ 6");
		priceList.add("$ 8");
		priceList.add("$ 12");
		priceList.add("$ 5");
		priceList.add("$ 4");
		
		// Images List
		
		imagesList.add(R.drawable.mango);
		imagesList.add(R.drawable.apple);
		imagesList.add(R.drawable.grapes);
		imagesList.add(R.drawable.orange);
		imagesList.add(R.drawable.guava);
		imagesList.add(R.drawable.avocado);
	}
	
	public static ArrayList<Fruit> getFruits()
	{
		createData();
		ArrayList<Fruit> fruitList = new ArrayList<Fruit>();
		
		for(int i = 0; i<namesList.size(); i++)
		{
			Fruit fruit = new Fruit();
			
			fruit.setName(namesList.get(i));
			fruit.setDesc(descList.get(i));
			fruit.setPrice(priceList.get(i));
			fruit.setImage(imagesList.get(i));
			
			fruitList.add(fruit);
		}
		
		return fruitList;
	}
}
