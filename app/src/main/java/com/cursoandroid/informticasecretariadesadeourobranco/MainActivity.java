package com.cursoandroid.informticasecretariadesadeourobranco;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends Activity {

    private DatabaseReference databaseReferencia = FirebaseDatabase.getInstance().getReference();
    private DatabaseReference usuarioReferencia = databaseReferencia.child("Reclamações");
    private EditText nomeUsuario;
    private EditText telefoneUsuario;
    private EditText reclamacaoUsuario;
    private EditText ubsUsuario;
    private Button cadastrar;
    private EditText edit;
    Calendar c = Calendar.getInstance();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMM/YYYY --- hh:mm");
    private String data = sdf.format(c.getTime());




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nomeUsuario = (EditText) findViewById(R.id.nomeId);
        telefoneUsuario = (EditText) findViewById(R.id.telefoneId);
        reclamacaoUsuario = (EditText) findViewById(R.id.reclamacaoId);
        ubsUsuario = (EditText) findViewById(R.id.ubsId);
        cadastrar = (Button) findViewById(R.id.botaoId);



        cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Usuario usuario = new Usuario();


                usuario.setNome(nomeUsuario.getText().toString());
                usuario.setTelefone(telefoneUsuario.getText().toString());
                usuario.setReclamacao(reclamacaoUsuario.getText().toString());
                usuario.setUbs(ubsUsuario.getText().toString());
                usuario.setData(data);


                usuarioReferencia.child("Dados Enviados: ").push().setValue(usuario);
                nomeUsuario.setText("");
                telefoneUsuario.setText("");
                reclamacaoUsuario.setText("");
                ubsUsuario.setText("");



                Toast.makeText(MainActivity.this, "Sua reclamação foi enviada, em breve entraremos em contato.",Toast.LENGTH_LONG).show();



            }
        });







    }
}

