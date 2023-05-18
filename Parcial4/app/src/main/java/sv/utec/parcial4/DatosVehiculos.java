package sv.utec.parcial4;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import sv.utec.parcial4.Base.DbClientes;

public class DatosVehiculos extends Fragment {
    EditText IDCLIENTE,IDVEHICULO,MATRICULA,KILOMETRAJE;
    Button Agregar;
    Context context;




    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.vehiculocliente,container,false);

    }


}
