package cl.inacap.reciclag;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ConductorSignUp2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conductor_sign_up2);
    }

    public void entrarButton(View view) {

        Intent miIntent=null;
        switch (view.getId()){
            case R.id.ingresarConBtn:
                miIntent=new Intent(ConductorSignUp2.this,mostrarSolicitudes.class);
                break;
        }
        if (miIntent!=null){
            startActivity(miIntent);
        }

    }
}
