package com.example.spinnerlistview_custom2;

import java.util.ArrayList;


public class DetailsDataList {
	
	static ArrayList<Integer> imageList = new ArrayList<Integer>();
	static ArrayList<String> nameList = new ArrayList<String>();
	static ArrayList<Integer> phoneList = new ArrayList<Integer>();
	static ArrayList<String> emailList = new ArrayList<String>();

	
	private static void createData(){
		
		imageList.add(R.drawable.apple);
		imageList.add(R.drawable.mango);
		imageList.add(R.drawable.grapes);
		imageList.add(R.drawable.guava);
		imageList.add(R.drawable.orange);
		imageList.add(R.drawable.avocado);
		
		
		nameList.add("Mihir Shah");
		nameList.add("Khusboo Shah");
		nameList.add("Pratik Shah");
		nameList.add("Hena Shah");
		nameList.add("Vaibhav Shah");
		nameList.add("Sagar Shah");
		
		phoneList.add(29748);
		phoneList.add(41201);
		phoneList.add(66446);
		phoneList.add(64466);
		phoneList.add(07017);
		phoneList.add(71070);
		
		
		
		emailList.add("mihir99@gmail.com");
		emailList.add("khusboo@mihir.com");
		emailList.add("pratic009@gmail.com");
		emailList.add("hena@pratik.com");
		emailList.add("vkshah88@gmail.com");
		emailList.add("sagar18shah@gmail.com");

	}

	public static ArrayList<Details> getInfo(){
		
		createData();
		
		ArrayList<Details> allDetails = new ArrayList<Details>();
			
			for (int i = 0; i<nameList.size(); i++){
				
				Details details = new Details();
				details.setImage(imageList.get(i));
				details.setName(nameList.get(i));
				details.setPhone(phoneList.get(i));
				details.setEmail(emailList.get(i));
				
				allDetails.add(details);
			}
	
			return allDetails;
	} 
}



