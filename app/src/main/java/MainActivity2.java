
import androidx.appcompat.app.AppCompatActivity;

/*import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

    public class MainActivity2 extends AppCompatActivity implements FormularioInterfaz.View {
        EditText editUsuario;
        Button btnRegistrarse;

        ControladorFormulario controlador= new ControladorFormulario(this);
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main2);


            etName=(EditText)findViewById(R.id.et3);
            FormularioDTO formularioDTO= new FormularioDTO(etName.getText().toString());
            button=(Button) findViewById(R.id.button);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(final View view) {

                    controlador.validarFormulario(formularioDTO);
                    controlador.usuarioGuardarUsuario(formularioDTO);

                }
            });
        }


        @Override
        public void validarResultadoFormulario(String editText, String mensaje) {
            if(editText.equals("nombre")){
                etName.setError(mensaje);
            }
        }

        @Override
        public void respuestaGuardadoUsuario( Boolean respuesta) {
            if(respuesta){
                Toast toast1=Toast.makeText(this,"datos guardados", Toast.LENGTH_LONG);
                toast1.show();

            }else{
                Toast.makeText(this,"datos no guardados", Toast.LENGTH_LONG).show();
            }
        }
    }



}
*/