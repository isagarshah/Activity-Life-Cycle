package com.example.sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLite_DBAdapter extends SQLiteOpenHelper {

	public static final String DB_NAME = "users.db";
	public static final String TABLE_NAME = "users";
	
	String TBL_CREATE = "create table if not exists users(uid integer primary key, "
			+ "fname text not null, lname text not null)";
	
	SQLiteDatabase database;

	
	public SQLite_DBAdapter(Context context) {
		super(context, DB_NAME, null, 1);
		
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(TBL_CREATE);
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		System.out.println("DB changed from: " +oldVersion+ "to " +newVersion );
		
	}
	
	public SQLite_DBAdapter open(){
		//database = getReadableDatabase();
		
		database = getWritableDatabase();
		return this;
	}
	
	public void close(){
		database.close();
		
	}
	
	public boolean addUser (int id, String firstName, String lastName){
		ContentValues values = new ContentValues();
		values.put("uid", id); 						// In key-value pair, the key is taken from where you have mentioned column name 
		values.put("fName", firstName);            //and the value is taken from the parameter. 
		values.put("lName", lastName);
		
		return database.insert(TABLE_NAME, null, values) > 0;
	} 

	
	public int deleteUser(int id){
		
		return database.delete(TABLE_NAME, "uid="+id, null);
	}
		
	
	public boolean update(int id, String fname, String lname){
		ContentValues values = new ContentValues();
		
		if(!fname.equals(""))
			values.put("fname", fname);
		
		if(!lname.equals(""))
			values.put("lname", lname);
		
		return database.update(TABLE_NAME, values, "uid= "+ id, null) >0;
				
		

	}
	
	public Cursor allUsers(){

		return database.query(TABLE_NAME, null, null, null, null, null, null);
}
	
}
