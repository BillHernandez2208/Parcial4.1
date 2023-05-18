package sv.utec.parcial4.Base;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class baseDatos extends SQLiteOpenHelper {
    Context context;
    private static final int VERSION_BASEDATOS=1;
    private static final String NOMBRE_BASE="Clientes.db";
    public static final String NOMBRE_TABLACL="t_clientes";

    public baseDatos(@Nullable Context context) {
        super(context, NOMBRE_BASE, null, VERSION_BASEDATOS);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "+NOMBRE_TABLACL+" ("+
                "IDCLIENTE INTEGER PRIMARY KEY  ,"+
                "NOMCLIENTE TEXT NOT NULL ,"+
                "APCLIENTE TEXT NOT NULL ,"+
                "DIR TEXT NOT NULL ,"+
                "cIUDAD TEXT NOT NULL"
                +")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE "+NOMBRE_TABLACL);
        /*adicion de creacion base de datos 03052023*/
        onCreate(db);
        /*adicion de creacion base de datos 03052023*/
    }


    public long insertCl(Integer IDCLIENTE,String NOMCLIENTE, String APCLIENTE, String DIRCLIENTE, String CIUDADCLIENTE){
        long codigo= 0;
        try{

            baseDatos Basedatos = new baseDatos(context);
            SQLiteDatabase db = Basedatos.getWritableDatabase();
            ContentValues values = new ContentValues();
            values.put("ID",IDCLIENTE);
            values.put("NOMBRE",NOMCLIENTE);
            values.put("APELLIDO",APCLIENTE);
            values.put("DIRECCION",DIRCLIENTE);
            values.put("CIUDAD",CIUDADCLIENTE);
            codigo = db.insert(NOMBRE_TABLACL, null, values);
            return codigo;
        } catch (Exception ex){
            ex.toString();
            return codigo=0;
        }

    }

}
