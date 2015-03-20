package com.loginusuario;

import com.asd.R;

import webservice.Servicios;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
	private TextView result;
	private String celsius;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final EditText user = (EditText)findViewById(R.id.user);
        final EditText pass = (EditText)findViewById(R.id.pass);
        Button btn = (Button)findViewById(R.id.login);
        result = (TextView)findViewById(R.id.celsius);
 
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	if (user.length() > 0 && pass.length() > 0) {
                    getUsuario(user.getText().toString(), pass.getText().toString());
                } else {
                	result.setText("Usuario o contraseña estan vacios.");
                }
            }
        });
    }
    
    private final void getUsuario(final String usuario,final String contrasena) {
        new Thread(new Runnable() {
     
            @Override
            public void run() {
                Servicios ex = new Servicios();
                celsius = ex.loginUser(usuario, contrasena);
                handler.sendEmptyMessage(0);
                }
        }).start();
    }
    
    public Handler handler = new Handler(new Handler.Callback() {
    	 
        @Override
        public boolean handleMessage(Message msg) {
            switch (msg.what) {
     
                case 0:
                	result.setText(celsius);
                    break;
            }
            return false;
        }
    });

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
