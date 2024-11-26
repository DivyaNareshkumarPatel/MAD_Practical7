import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context: Context?): SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {
    companion object{
        const val DATABASE_VERSION = 1
        const val DATABASE_NAME = "person_db"
    }

    override fun onCreate(db: SQLiteDatabase?) {
//        db?.execSQL(PersonTableData.CREATE_TABLE)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
//        db?.execSQL(PersonTableData.DROP_TABLE)
        onCreate(db)
    }
    
}