package com.historial;

import webservice.Servicios;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.TwoLineListItem;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		final ListView listaCuentas = (ListView) findViewById(R.id.listaConsultas);

		Servicios ex = new Servicios();
		Log.i("NIPSON", "1");
		final domain.ConsultaVO[] consultas = ex.obtenerConsultas();
		Log.i("NIPSON", "cant datos ==" + consultas.length);
		ArrayAdapter<domain.ConsultaVO> adaptador = new ArrayAdapter<domain.ConsultaVO>(
				this, android.R.layout.simple_list_item_1, consultas);
		
		
		adaptador = new ArrayAdapter<domain.ConsultaVO>(this, android.R.layout.simple_list_item_2, android.R.id.text1, consultas)
		  {
		    public View getView(int position, View convertView, ViewGroup parent) {
		      View view = super.getView(position, convertView, parent);
		      TextView text1 = (TextView) view.findViewById(android.R.id.text1);
		      TextView text2 = (TextView) view.findViewById(android.R.id.text2);
		      text1.setText(consultas[position].getTipoConsulta().getDescripcion()+"\n"+consultas[position].getCantidadCambiada()+"-->"+consultas[position].getCantidadConsultada());
		      text2.setText(consultas[position].getUsuario().getUsuario()+"  "+consultas[position].getFechaCambio());
		      return view;
		    }
		  };
		 listaCuentas.setAdapter(adaptador);
		
	}

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
