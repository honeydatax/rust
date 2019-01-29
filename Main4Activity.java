package fatura.app.android;



import android.app.*;
import android.os.*;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.view.KeyEvent.Callback;
import 	android.view.InputEvent;
import	android.view.KeyEvent;
import android.view.MenuInflater;
import 	android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.ViewConfiguration;

import android.content.ContextWrapper;
import android.view.ContextThemeWrapper;

import android.content.Context;


import android.app.Activity;
import android.os.Bundle;




import android.os.Environment;
import android.util.Log;
import android.widget.TextView;
import java.io.File;



import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;



import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

import java.lang.Object;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import android.text.TextUtils;

import android.view.View; 
import android.view.View.OnClickListener; 
import android.widget.Button; 
import android.widget.EditText; 
import android.widget.TextView;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Exception;
import java.lang.Exception;
import java.io.IOException;
import android.webkit.WebView;
import android.view.KeyEvent.Callback;
import java.lang.Object;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import android.view.MenuItem;
import android.widget.Toast; 
import android.view.InputEvent;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.List;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import 	android.content.Context;
import android.content.ContextWrapper;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import android.app.ListActivity;
import java.io.*;


import 	java.util.Collections;
import java.util.List;
import java.util.Comparator;
import java.util.Arrays;
import android.util.Base64;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import android.os.Environment;
import android.util.Log;
import android.widget.TextView;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.Formatter;





public class Main4Activity extends Activity 
{
	int nn;
	SQLiteDatabase db;
	Cursor cursor;
	private Button btn;
	private Button btn1;
	private Button btn2;
	private Button btn3;
	private Button btn4;
	private Button btn5;
	private Button btn6;


	private int iii;
	private int entidade=-1;
	private Context context;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.adicionar2);

		//setTitle();
		context=this;

		btn = (Button) findViewById(R.id.add); 	
		btn1 = (Button) findViewById(R.id.cancelar); 	
		btn2 = (Button) findViewById(R.id.modificar); 	
		btn3 = (Button) findViewById(R.id.limpar); 	
		btn4 = (Button) findViewById(R.id.apagar); 	
		btn5 = (Button) findViewById(R.id.zero); 
		btn6 = (Button) findViewById(R.id.documento); 

		final EditText ED = (EditText)findViewById(R.id.edata);

		final EditText ED2 = (EditText)findViewById(R.id.enome);
		final EditText ED3 = (EditText)findViewById(R.id.eimposto);
		final EditText ED4 = (EditText)findViewById(R.id.equantidade);
		final EditText ED5 = (EditText)findViewById(R.id.evalor);

		btn.setOnClickListener(new OnClickListener() { 
				@Override 
				public void onClick(View v) {
					setTitle("adicionar");

					File f2=new File("/sdcard/app.android/facturas.app.android/facturas.data");
					try{
						db =   openOrCreateDatabase  (f2.toString(),  Context.MODE_PRIVATE,   null);

						String s="INSERT INTO movimento (entidades,data,nome,imposto,quantidade,valor) VALUES ("+Integer.toString(entidade)+",'"  +ED.getText()+"','"+ED2.getText()+"',"+ED3.getText()+","+ED4.getText()+","+ED5.getText()+")";
						setTitle(s);
						db.execSQL(s);

						db.close();
					}catch(Exception e){
						setTitle(e.toString());
					}
					
					Intent intent = new Intent(context,Main3Activity.class);

					startActivity(intent);  


					finish(); 


				}});

		btn1.setOnClickListener(new OnClickListener() { 
				@Override 
				public void onClick(View v) {
					setTitle("cancelar");


					Intent intent = new Intent(context,Main3Activity.class);

					startActivity(intent);  



					finish(); 





				}});



		btn2.setOnClickListener(new OnClickListener() { 
				@Override 
				public void onClick(View v) {
					setTitle("modificar");
					ContentValues cv = new ContentValues();
					File f2=new File("/sdcard/app.android/facturas.app.android/facturas.data");

					db =   openOrCreateDatabase  (f2.toString(),  Context.MODE_PRIVATE,   null);
					db.delete("movimento","Id<0",null);
					cv.put("entidades",Integer.toString(entidade));
					cv.put("data",ED.getText().toString());
					cv.put("nome",ED2.getText().toString());
					cv.put("imposto",ED3.getText().toString());
					cv.put("quantidade",ED4.getText().toString());
					cv.put("valor",ED5.getText().toString());

					db.update("movimento", cv, "Id="+Integer.toString( iii), null);

					db.delete("movimento","Id<0",null);
					db.close();


					Intent intent = new Intent(context,Main3Activity.class);

					startActivity(intent);  


					finish(); 


				}});

		btn3.setOnClickListener(new OnClickListener() { 
				@Override 
				public void onClick(View v) {
					setTitle("adicionar");

					iii=-1;
					ED.setText("");

					ED2.setText("");
					ED3.setText("");
					ED4.setText("");
					ED5.setText("");


				}});



		btn4.setOnClickListener(new OnClickListener() { 
				@Override 
				public void onClick(View v) {

					setTitle("apagar");

					File f2=new File("/sdcard/app.android/facturas.app.android/facturas.data");
					db =   openOrCreateDatabase  (f2.toString(),  Context.MODE_PRIVATE,   null);
					db.delete("movimento","Id<0",null);
					db.delete("movimento","Id="+Integer.toString(iii),null);

					db.delete("movimento","Id<0",null);
					db.close();


					Intent intent = new Intent(context,Main3Activity.class);

					startActivity(intent);  


					finish(); 


				}});

		btn5.setOnClickListener(new OnClickListener() { 
				@Override 
				public void onClick(View v) {
					setTitle("cancelar");


					Intent intent = new Intent(context,MainActivity.class);

					startActivity(intent);  



					finish(); 





				}});


		btn6.setOnClickListener(new OnClickListener() { 
				@Override 
				public void onClick(View v) {
					setTitle("relatorio");

					File f = null;
					boolean b = false;

					try{
						// create new file
						f = new File("/sdcard/app.android/facturas.app.android/facturas.txt");

						// tries to create new file in the system
						b = f.createNewFile();


						FileWriter fileWritter = new FileWriter("/sdcard/app.android/facturas.app.android/facturas.txt");
						BufferedWriter bufferWritter = new BufferedWriter(fileWritter);

						File f2=new File("/sdcard/app.android/facturas.app.android/facturas.data");


						int ii;




						db =   openOrCreateDatabase  (f2.toString(),  Context.MODE_PRIVATE,   null);

						cursor = db.query("comunicacao", new String[] { "Id","a", "b","c","d","e"},null,null,null,null,null ,null);

						if (cursor.moveToFirst()) {

							entidade=Integer.parseInt( cursor.getString(1));



							if(entidade ==-1) setTitle("não a entidade selecionada");

							bufferWritter.write("factura\n"+ cursor.getString(1) +"\n");
							bufferWritter.write( cursor.getString(2) +"\n");
							bufferWritter.write( cursor.getString(3) +"\n");
							bufferWritter.write( cursor.getString(4) + "\n");
							bufferWritter.write( cursor.getString(5) +"\n\n\n\n");
							bufferWritter.write( String.format("%10s","Data")+"|");
							bufferWritter.write( String.format("%20s","produto")+"|");
							bufferWritter.write( String.format("%2s"," ")+"%|");
							bufferWritter.write( String.format("%20s","quantidade")+"|");
							bufferWritter.write( String.format("%20s","valor")+"|");
							bufferWritter.write( String.format("%20s","sub total")+"\n");
							bufferWritter.write( "------------------------------------------------------------------------------------------------------\n");

						}

						cursor = db.query("movimento", new String[] { "Id","data", "nome","imposto","quantidade","valor","entidades"  },"entidades="+Integer.toString(entidade),null,null,null,"data" ,null);
						double total=0.0d;
						double valor=0.0d;
						
						double quantidade=0.0d;
						double subtotal=0.0d;
						int imposto=0;
						if (cursor.moveToFirst()) {
							do{

								bufferWritter.write(String.format("%10s",cursor.getString(1))+"|");
								bufferWritter.write(String.format("%20s",cursor.getString(2))+"|");
								valor=cursor.getDouble(3);
								
							
								
								
								imposto=cursor.getInt(3);
								bufferWritter.write(String.format("%2s", Integer.toString(imposto)) +"%|"  );
								quantidade=cursor.getDouble(4);
								bufferWritter.write(String.format("%20s",Double.toString(quantidade))  +"|" );
								valor=cursor.getDouble(5);
								bufferWritter.write(String.format("%20s",Double.toString(valor))+"|");

								subtotal=quantidade*valor;
								bufferWritter.write(String.format("%20s",Double.toString(subtotal))  +"\n" );

								total=total+subtotal;
								
								
							}while(cursor.moveToNext());
						}
						
						cursor.close();
						
						cursor = db.query("movimento", new String[] { "Id","data", "nome","imposto","quantidade","valor","entidades"  },"entidades="+Integer.toString(entidade),null,null,null,"imposto" ,null);
						
						
						
						bufferWritter.write( "--------------------------------------------------------------------------------------------------\n");
						bufferWritter.write("\ntotal:"+ String.format("%20s", Double.toString(total))+"\n\n\n\n\n\nimposto:\n\n");
						imposto=0;
						quantidade=0.0d;
						subtotal=0.0d;
						valor=0.0;
						total=0.0;
						if (cursor.moveToFirst()) {
							do{
								imposto=cursor.getInt(3);
								
								quantidade=cursor.getDouble(4);
								
								valor=cursor.getDouble(5);
							

								subtotal=quantidade*valor*imposto/100;
								

								total=total+subtotal;
							}while(cursor.moveToNext());
						}
						bufferWritter.write(String.format("%20s",Double.toString(total))  +"euros\n" );
						bufferWritter.close();
cursor.close();
						db.close();
						File fss= new File(f.toString() );
						Intent intent = new Intent();
						intent.setAction(android.content.Intent.ACTION_VIEW);
						intent.setDataAndType(Uri.fromFile(fss),"*/*");
						startActivity(intent);

					} catch (IOException e) {
						setTitle("erro no relatorio");
					}	






				}});


		File f2=new File("/sdcard/app.android/facturas.app.android/facturas.data");

		db =   openOrCreateDatabase  (f2.toString(),  Context.MODE_PRIVATE,   null);

		cursor = db.query("comunicacao", new String[] { "Id","a", "b","c","d","e"},null,null,null,null,null ,null);

		if (cursor.moveToFirst()) {

			entidade=Integer.parseInt( cursor.getString(1));


			setTitle( cursor.getString(2));
			if(entidade ==-1) setTitle("não a entidade selecionada");

		}

		cursor.close();


		cursor = db.query("comunicacao2", new String[] { "Id","a", "b","c","d","e","f","g"},null,null,null,null,null ,null);

		if (cursor.moveToFirst()) {

			iii=Integer.parseInt( cursor.getString(1));



			if(iii==-1) setTitle("adicionar");
			ED.setText( cursor.getString(2));

			ED2.setText(cursor.getString(3));
			ED3.setText(cursor.getString(4));
			
			ED4.setText(cursor.getString(5));
			ED5.setText(cursor.getString(6));
			
		}
		cursor.close();

		db.close();

	}


}






