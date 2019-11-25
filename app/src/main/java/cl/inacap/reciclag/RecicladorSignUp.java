package cl.inacap.reciclag;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RecicladorSignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reciclador_sign_up);

        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(this, "bd_solicitudes", null, 1);

    }


    public void entrarBoton(View view) {
        Intent miIntent=null;
        switch (view.getId()){
            case R.id.ingresarRecBtn:
                miIntent=new Intent(RecicladorSignUp.this,AddSolicitud.class);
                break;
        }
        if (miIntent!=null){
            startActivity(miIntent);
        }
    }
}
