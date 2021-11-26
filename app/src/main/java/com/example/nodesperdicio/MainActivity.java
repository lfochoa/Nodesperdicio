package com.example.nodesperdicio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements LoginIterface.View {
    EditText editUsuario;
    EditText editPassword;
    Button btnIngresar;
    Button btnFacebook;
    Button btnGmail;
    EditText txtRegistrarse;

    ControladorLogin controlador=new ControladorLogin(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editUsuario=(EditText)findViewById(R.id.editUsuario);
        editPassword=(EditText)findViewById(R.id.editPassword);
        editUsuario=(EditText)findViewById(R.id.editUsuario);
        btnIngresar=(Button)findViewById(R.id.btnIngresar);
        btnFacebook=(Button)findViewById(R.id.btnFacebook);
        btnGmail= (Button) findViewById(R.id.btnGmail);
        txtRegistrarse=(EditText)findViewById(R.id.txtRegistrarse);


        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Boolean x1,x2;
                x1=controlador.validarLogin(editUsuario.getText().toString(),"usuario");
                x2=controlador.validarLogin(editPassword.getText().toString(),"password");
                if(x1==true && x2==true){
                    controlador.usuarioPermitido(editUsuario.getText().toString(),editPassword.getText().toString());
                }
            }
        });

        }

    @Override
    public void validarResultado(String editText, String mensaje) {
        if(editText.equals("usuario")){
            editUsuario.setError(mensaje);
        }
        if(editText.equals("password")){
            editPassword.setError(mensaje);
        }

    }

    @Override
    public void usuarioAutorizado(Boolean valida) {
        if(valida){
            Toast.makeText(this,"usuario autorizado", Toast.LENGTH_LONG).show();
        } else{
            Toast.makeText(this,"usuario/contraseña incorrecto ", Toast.LENGTH_LONG).show();
        }

    }
}
