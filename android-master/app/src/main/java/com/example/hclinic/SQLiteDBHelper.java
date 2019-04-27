package com.example.hclinic;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLiteDBHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 2;
    public static final String DATABASE_NAME = "loggedInUser.db";
    public static final String PERSON_TABLE_NAME = "userData";
    public static final String PERSON_COLUMN_ID = "_id";
    public static final String PERSON_COLUMN_USERNAME = "username";
    public static final String PERSON_COLUMN_PASSWORD = "password";

    public SQLiteDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE " + PERSON_TABLE_NAME + " (" +
                PERSON_COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                PERSON_COLUMN_USERNAME + " TEXT, " +
                PERSON_COLUMN_PASSWORD + " TEXT " + ")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + PERSON_TABLE_NAME);
        onCreate(sqLiteDatabase);
    }
}
