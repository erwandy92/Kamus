package info.erwandy.dicodingprojectkamus.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static android.provider.BaseColumns._ID;
import static info.erwandy.dicodingprojectkamus.Database.DatabaseContract.KamusColumns.*;
import static info.erwandy.dicodingprojectkamus.Database.DatabaseContract.TABLE_ENG_TO_IND;
import static info.erwandy.dicodingprojectkamus.Database.DatabaseContract.TABLE_IND_TO_ENG;

/**
 * Created by Nursing Bank IT Dept on 3/29/2018.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    private static String DATABASE_NAME         = "dbkamus";
    private static final int DATABASE_VERSION   = 1;

    public static String CREATE_TABLE_IND_TO_ENG = "create table "+TABLE_IND_TO_ENG+
            " ("+_ID+" integer primary key autoincrement, " +
            FIELD_KATA+" text not null, " +
            FIELD_ARTI+" text not null);";

    public static String CREATE_TABLE_ENG_TO_IND = "create table "+TABLE_ENG_TO_IND+
            " ("+_ID+" integer primary key autoincrement, " +
            FIELD_KATA+" text not null, " +
            FIELD_ARTI+" text not null);";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_IND_TO_ENG);
        db.execSQL(CREATE_TABLE_ENG_TO_IND);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_IND_TO_ENG);
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_ENG_TO_IND);
        onCreate(db);
    }
}
