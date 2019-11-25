package cl.inacap.reciclag;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import cl.inacap.reciclag.objetos.Solicitud;
import cl.inacap.reciclag.utils.Utils;

public class detalleSolicitud extends AppCompatActivity {

    TextView nombreDetalleTxt, lotesDetalleTxt, direccionDetalleTxt;
    ConexionSQLiteHelper conn;
    ArrayList<String> listaInfo;
    ListView listViewSolicitudes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_solicitud);

        nombreDetalleTxt = (TextView) findViewById(R.id.nombreDetalleTxt);
        lotesDetalleTxt = (TextView) findViewById(R.id.lotesDetalleTxt);
        direccionDetalleTxt = (TextView) findViewById(R.id.direccionDetalleTxt);

        Bundle objetoEnviado=getIntent().getExtras();
        Solicitud solic=null;

        if(objetoEnviado!=null){
            solic= (Solicitud) objetoEnviado.getSerializable("solicitud");
            nombreDetalleTxt.setText(solic.getNombre().toString());
            lotesDetalleTxt.setText(solic.getLotes().toString());
            direccionDetalleTxt.setText(solic.getDireccion().toString());


        }
    }
    }




