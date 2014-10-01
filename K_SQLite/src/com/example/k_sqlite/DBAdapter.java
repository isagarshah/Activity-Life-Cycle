package com.example.k_sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DBAdapter extends SQLiteOpenHelper{

	public static final String DB_NAME = "user.db";
	public static final String TBL_NAME = "users";
	String TBL_CREATE = "create table if not exists users(uid integer primary key, "
			+ "fname text not null, lname text not null)";
	
	SQLiteDatabase database;

	
	public DBAdapter(Context context) {
		// Create or Open the DB
		super(context, DB_NAME, null, 1);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(TBL_CREATE);
	}

	public DBAdapter open()
	{
		//		database = getReadableDatabase();
		database = getWritableDatabase();
		return this;
	}

	public void close()
	{
		database.close();
	}

//	public long addUser(int id, String fname, String lname)
	public boolean addUser(int id, String fname, String lname)
	{
		ContentValues values = new ContentValues();
		values.put("uid", id);
		values.put("fname", fname);
		values.put("lname", lname);
		return database.insert(TBL_NAME, null, values) > 0;
//		return database.insert(TBL_NAME, null, values);
	}

	public int updateUser(int id, String fname, String lname)
	{
		ContentValues values = new ContentValues();
		if(!fname.equals(""))
			values.put("fname", fname);
		
		if(!lname.equals(""))
			values.put("lname", lname);

		return database.update(TBL_NAME, values, "uid="+id, null);
		//		return result;
	}

	public int deleteUser(int id)
	{
		return database.delete(TBL_NAME, "uid="+id, null);
	}
	
	public Cursor getAllUsers()
	{
//		return database.query(TBL_NAME, new String[] {"uid", "fname", "lname"}, null, null, null, null, null);
		return database.query(TBL_NAME, null, null, null, null, null, null);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		System.out.println("DB changed from : "+oldVersion+" to : "+newVersion);
	}
}
