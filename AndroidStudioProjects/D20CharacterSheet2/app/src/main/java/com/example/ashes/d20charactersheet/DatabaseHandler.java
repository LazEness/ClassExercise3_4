package com.example.ashes.d20charactersheet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.util.Log;

public class DatabaseHandler extends SQLiteOpenHelper {


    // ====================== String Variables ======================
// The Android's default system path of your application database.
    private static String DB_PATH = "/data/data/com.example/databases/"; // Package name
    private static final String DATABASE_NAME = "test"; // Database Name

    // ++++++++++++++++++++++ int Variables ++++++++++++++++++++++
    private static final int DATABASE_VERSION = 1; // Database Version

    // = = = = = = = = = = = Other Variables = = = = = = = = = = ==
    private SQLiteDatabase myDataBase;
    private final Context myContext;
    SQLiteDatabase db;


    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.myContext = context;


    }

    public void db_open() {
        db = this.getWritableDatabase();
    }

    /**
     * Creates a empty database on the system and rewrites it with your own
     * database.
     */
    public void createDataBase() throws IOException {
        boolean dbExist = databaseExist();

        if (dbExist) {
            // do nothing - database already exist
        } else {
            // By calling this method and empty database will be created into
            // the default system path
            // of your application so we are gone a be able to overwrite that
            // database with our database.
            this.getReadableDatabase();
            try {
                copyDataBase(); // call method to copy database
                db = this.getWritableDatabase();
            } catch (IOException e) {
                throw new Error("Error copying database");
            }
        }
    }

    /**
     * Mrthod to check database is exist or not
     *
     * @return
     */
    public boolean databaseExist() {
        File dbFile = new File(DB_PATH + DATABASE_NAME);
        return dbFile.exists();
    }

    /**
     * Copies your database from your local assets-folder to the just created
     * empty database in the system folder, from where it can be accessed and
     * handled. This is done by transfering bytestream.
     */
    private void copyDataBase() throws IOException {
        // Open your local db as the input stream
        InputStream myInput = myContext.getAssets().open(DATABASE_NAME);

        // Path to the just created empty db
        String outFileName = DB_PATH + DATABASE_NAME;

        // Open the empty db as the output stream
        OutputStream myOutput = new FileOutputStream(outFileName);

        // transfer bytes from the inputfile to the outputfile
        byte[] buffer = new byte[1024];
        int length;
        while ((length = myInput.read(buffer)) > 0) {
            myOutput.write(buffer, 0, length);
        }

        // Close the streams
        myOutput.flush();
        myOutput.close();
        myInput.close();

    }


    /**
     * Close Database
     */
    @Override
    public synchronized void close() {


        if (myDataBase != null)
            myDataBase.close();
        super.close();
    }

    public void DB_close() {
        if (db != null)
            db.close();
    }


    /**
     * Method to add data
     */
    public boolean addData(int vno, String content1, String content2) {
        boolean status = false;

        ContentValues values = new ContentValues();
        String checkEntry = "select id from yourtable where id=" + vno;// +"' AND userid="+userid;

        Cursor magazinecursor = db.rawQuery(checkEntry, null);
        if (magazinecursor.moveToFirst()) {

        } else {

            values.put("id", vno);
            values.put("content1", content1);
            values.put("content2", content2);


            long check = db.insert("yourtable", null, values);
            if (check > -1) {
                Log.i("inserstatus", "yourtable insert successfull");
                status = true;
            } else {
                Log.i("insertstatus", "yourtable insert unsuccessful");
            }
        }

        return status;
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}