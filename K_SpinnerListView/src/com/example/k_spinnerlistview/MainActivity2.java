package com.example.k_spinnerlistview;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity2 extends Activity {

	Spinner spinner;
	ListView listView;
	ArrayAdapter<String> adapter1, adapter2;
	
	String[] friuts = {"Select a Fruit", "Mango", "Apple", "Grapes", "Orange", "Guava", "Avacoda"};
	
	ArrayList<String> fruitsList = new ArrayList<String>();
	ArrayList<String> descList = new ArrayList<String>();
	ArrayList<String> priceList = new ArrayList<String>();
	ArrayList<Integer> imagesList = new ArrayList<Integer>();
	
	//LayoutInflater inflater;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// Names of Fruits
		fruitsList.add("Mango");
		fruitsList.add("Apple");
		fruitsList.add("Grapes");
		fruitsList.add("Orange");
		fruitsList.add("Guava");
		fruitsList.add("Avacoda");
		
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
		
		spinner = (Spinner) findViewById(R.id.spinner);
		listView = (ListView) findViewById(R.id.list); // will put null 
		
		adapter1 = new ArrayAdapter<String>(this, R.layout.list_item,fruitsList);
		adapter2 = new ArrayAdapter<String>(this, R.layout.spinner_item,friuts);
		
		CustomAdapter customAdapter1 = new CustomAdapter(fruitsList, descList, priceList, imagesList, 
				getLayoutInflater(), this);
		
//		FruitCustomAdapter fruitCustomAdapter = new FruitCustomAdapter(FruitDataList.getFruits(), this);
		
//		listView.setAdapter(fruitCustomAdapter);
		listView.setAdapter(customAdapter1);		
//		listView.setAdapter(adapter1);

		spinner.setAdapter(adapter2);
//		spinner.setAdapter(customAdapter1);
		
		//inflater = getLayoutInflater();
		
		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				
				String str = parent.getItemAtPosition(position).toString(); 
				Toast.makeText(MainActivity2.this, "Go and Eat "+str, Toast.LENGTH_SHORT).show();
			}
		});
		
		spinner.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
//				String str = parent.getItemAtPosition(position).toString();
				 
				if(position != 0)
				{
					String str = friuts[position];
					Toast.makeText(MainActivity2.this, "Go and Eat "+str, Toast.LENGTH_SHORT).show();
				}
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				Toast.makeText(MainActivity2.this, "Nothing is Selected", Toast.LENGTH_SHORT).show();
			}
		});
	}
	
	/*public ArrayList<Fruit> getFruits()
	{
		ArrayList<Fruit> fruitList = new ArrayList<Fruit>();
		
		for(int i = 0; i<fruitList.size(); i++)
		{
			Fruit fruit = new Fruit();
			fruit.setName(fruitsList.get(i));
			fruit.setDesc(descList.get(i));
			fruit.setPrice(priceList.get(i));
			fruit.setImage(imagesList.get(i));
			
			fruitList.add(fruit);
		}
		
		return fruitList;
	}*/
}
