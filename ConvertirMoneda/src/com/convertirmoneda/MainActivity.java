package com.convertirmoneda;

import webservice.Servicios;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

	private TextView mensaje;
	private Button btn;
	private EditText cantidad_cambiar;
	private int accion = 0;
	private float cantidad = 0;
	private float dollar = 610;
	String tipo = "";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Spinner select;
		select = (Spinner) findViewById(R.id.tipo_consulta);// fetch the
															// spinner
															// from
															// layout
															// file
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, getResources()
						.getStringArray(R.array.select));// setting the
															// country_array to
															// spinner
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		select.setAdapter(adapter);

		mensaje = (TextView) findViewById(R.id.mensaje);
		btn = (Button) findViewById(R.id.aceptar);
		cantidad_cambiar = (EditText) findViewById(R.id.cantidad);
		
		select.setOnItemSelectedListener(new OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> parentView, View arg1,
					int position, long id) {
				try {

					tipo = parentView.getItemAtPosition(position).toString();
					accion = position;
				} catch (Exception e) {

				}
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
			}
		});

		btn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				if (accion == 0) {
					cantidad = Float.parseFloat(cantidad_cambiar.getText()
							.toString()) / dollar;
				} else {
					cantidad = Float.parseFloat(cantidad_cambiar.getText()
							.toString()) * dollar;
				}
				Servicios ex = new Servicios();
				String salida = ex.guardarConsulta(
						Float.parseFloat(cantidad_cambiar.getText().toString()),
						cantidad, tipo);
				mensaje.setText("" + cantidad);
			}
		});

	}

	// private final void getUsuario(final String usuario,final String
	// contrasena) {
	// new Thread(new Runnable() {
	//
	// @Override
	// public void run() {
	// Servicios ex = new Servicios();
	// celsius = ex.guardarConsulta(usuario, contrasena);
	// handler.sendEmptyMessage(0);
	// }
	// }).start();
	// }
	//
	// public Handler handler = new Handler(new Handler.Callback() {
	//
	// @Override
	// public boolean handleMessage(Message msg) {
	// switch (msg.what) {
	//
	// case 0:
	// result.setText(celsius);
	// break;
	// }
	// return false;
	// }
	// });

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
