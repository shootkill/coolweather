package com.coolweather.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {

	private static final String CREATE_PROVINCE="create table province("
			+"id integer primary key aotoincrement,"
			+"province_name text,"
			+"province_code text)";
	private static final String CREATE_CITY="create table city("
			+"id integer primary key autoincrement,"
			+"city_name text,"
			+"city_code text,"
			+"province_id integer)";
	private static final String CREATE_COUNTRY="create table country("
			+"id integer primary key autoincrement,"
			+"country_name text,"
			+"country_code text,"
			+"city_id integer)";
	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(CREATE_PROVINCE);//创建PROVINCE表
		db.execSQL(CREATE_CITY);  //创建CITY表
        db.execSQL(CREATE_COUNTRY);//创建COUNTRY表
	}
    public CoolWeatherOpenHelper(Context context,String name,CursorFactory factory,int version){
       super(context, name, factory, version);	
    }
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub

	}

}
