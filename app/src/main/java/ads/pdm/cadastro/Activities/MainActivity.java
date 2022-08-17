package ads.pdm.cadastro.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import ads.pdm.cadastro.Formulario;
import ads.pdm.cadastro.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText    editNomeEt;
    private EditText    editTelefoneEt;
    private EditText    editEmailEt;
    private CheckBox    emailListCb;
    private RadioButton mascRb;
    private RadioButton femRb;
    private EditText    editCityEt;
    private Spinner     uFSp;
    private Button      buttonClean;
    private Button      buttonSave;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNomeEt     = findViewById(R.id.editNomeEt);
        editTelefoneEt = findViewById(R.id.editTelefoneEt);
        editEmailEt    = findViewById(R.id.editEmailEt);
        emailListCb    = findViewById(R.id.emailListCb);
        mascRb         = findViewById(R.id.mascRb);
        femRb          = findViewById(R.id.femRb);
        editCityEt     = findViewById(R.id.editCityEt);
        uFSp           = findViewById(R.id.uFSp);

        buttonClean    = findViewById(R.id.buttonClean);
        buttonClean.setOnClickListener(this);

        buttonSave     = findViewById(R.id.buttonSave);
        buttonSave.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.buttonSave){
            String  nome        = this.editNomeEt.getText().toString();
            String  telefone    = this.editTelefoneEt.getText().toString();
            String  email       = this.editEmailEt.getText().toString();
            boolean listaEmails = this.emailListCb.isChecked();
            boolean sexoMasc    = this.mascRb.isChecked();
            boolean sexoFem     = this.femRb.isChecked();
            String  cidade      = this.editCityEt.getText().toString();
            String  estado      = ((TextView) this.uFSp.getSelectedView()).getText().toString();

            Formulario formulario = new Formulario(nome, telefone, email, listaEmails, sexoMasc, sexoFem, cidade, estado);
        }
        else{
            editNomeEt.getText().clear();
            editTelefoneEt.getText().clear();
            editEmailEt.getText().clear();
            emailListCb.setChecked(false);
            mascRb.setChecked(true);
            femRb.setChecked(false);
            editCityEt.getText().clear();
            uFSp.setSelection(0);
        }
    }
}