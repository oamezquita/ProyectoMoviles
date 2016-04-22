package com.JhonatanOscar.consultahorarios;

import android.R.color;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.view.Menu;
import android.widget.GridLayout;
import android.widget.LinearLayout;

public class PantallaPresentacion extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_presentacion);
		GridLayout fondo=(GridLayout)findViewById(R.id.GridLayout1);
		fondo.setBackgroundColor(Color.rgb(238, 127, 1));
        Thread logo = new Thread(){
			public void run(){
			try{
			int tiempo=0;
			while(tiempo<5000){
			sleep(100);
			tiempo=tiempo+100;
			}
			Intent i=new Intent(PantallaPresentacion.this,PantallaAutenticacion.class);
			startActivity(i);
			}
			catch(InterruptedException e){
			e.printStackTrace();
			}finally{
			finish();
			}
			}
			};
			logo.start();


    
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.pantalla_presentacion, menu);
        return true;
    }
    
}
