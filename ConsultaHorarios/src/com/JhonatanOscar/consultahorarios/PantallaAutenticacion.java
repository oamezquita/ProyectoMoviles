package com.JhonatanOscar.consultahorarios;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PantallaAutenticacion extends Activity {
	
	Button botonAuntenticar;
    EditText contraseñaText;
	EditText usuarioText;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        
		super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalla_autenticacion);
        botonAuntenticar=(Button)findViewById(R.id.botonAutenticacion);
        botonAuntenticar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			Autenticar();	
			}

			private void Autenticar() {
				// TODO Auto-generated method stub
			String usuario;
			String contraseña;
			contraseñaText=(EditText)findViewById(R.id.editTextContrasena);
			usuarioText=(EditText)findViewById(R.id.editTextUsuario);
			usuario=usuarioText.getText().toString();
			contraseña=contraseñaText.getText().toString();
			
			if(usuario.equalsIgnoreCase("20121234021")){
				
				if(contraseña.equalsIgnoreCase("abc123")){
				Intent i=new Intent(PantallaAutenticacion.this,PantallaInicio.class);
			startActivity(i);
				}
			}
			else{
				Toast.makeText(getApplicationContext(),"El Usuario O Contraseña no son validos", Toast.LENGTH_LONG).show();
				
			}
			}
		});
    
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.pantalla_presentacion, menu);
        return true;
    }

}
