package sv.utec.parcial4;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import sv.utec.parcial4.Base.baseDatos;

public class DatosCliente extends Fragment {

EditText ID,NOMBRE,APELLIDO,DIRECCION,CIUDAD;
Button Agregar;
    Context context;

    public DatosCliente() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatActivity appCompatActivity =new AppCompatActivity();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        inflater.inflate(R.layout.datoscliente, container, false);

        View view=inflater.inflate(R.layout.datoscliente, container, false);
        ID=view.findViewById(R.id.id);
        NOMBRE=view.findViewById(R.id.nombre);
        APELLIDO=view.findViewById(R.id.apellido);
        DIRECCION=view.findViewById(R.id.direccion);
        CIUDAD=view.findViewById(R.id.ciudad);
        Agregar = view.findViewById(R.id.agregar);

        Agregar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                baseDatos baseCl = new baseDatos(context);

                long codiSave=baseCl.insertCl(Integer.valueOf(ID.getText().toString()),NOMBRE.getText().toString(),APELLIDO.getText().toString(),DIRECCION.getText().toString(),CIUDAD.getText().toString());
                if(codiSave>0){
                    Toast.makeText(context, "exitosa", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(context, "error", Toast.LENGTH_SHORT).show();
                }
            }
        });


        return view;
    }
}