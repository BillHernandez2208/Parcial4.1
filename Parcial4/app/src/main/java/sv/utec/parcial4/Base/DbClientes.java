package sv.utec.parcial4.Base;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

public class DbClientes extends baseDatos{
    Context context;
    public DbClientes(@Nullable Context context) {
        super(context);
        this.context = context;
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

