package id.co.blogspot.infogabut.daftarmenucafe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    private CheckBox check1, check2, check3, check4;
    private Button pesan;
    private EditText text1, text2, text3, text4;
    String ori, Mocha, Cappucino, Vanilla;
    String angka1, angka2, angka3, angka4;
    int user_angka1, user_angka2, user_angka3, user_angka4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        awal();
        perintahTombolPesan();
        PerintahCheckBox();
    }

    public void awal() {
        text1 = (EditText) findViewById(R.id.jml1);
        text2 = (EditText) findViewById(R.id.jml2);
        text3 = (EditText) findViewById(R.id.jml3);
        text4 = (EditText) findViewById(R.id.jml4);

        text1.setEnabled(false);
        text2.setEnabled(false);
        text3.setEnabled(false);
        text4.setEnabled(false);
    }

    public void PerintahCheckBox() {
        check1(android.widget.CheckBox) findViewById(R.id.checkBox1);
        check1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    text1.setEnabled(true);
                    text1.setEnabled("");
                } else {
                    text1.setEnabled(false);
                    text1.setEnabled("");
                }
            });
        }
        check2(CheckBox) findViewById(R.id.checkBox2);
        check2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    text2.setEnabled(true);
                    text2.setEnabled("");
                } else {
                    text2.setEnabled(false);
                    text2.setEnabled("");
                }
            });
        }
        check3(CheckBox) findViewById(R.id.checkBox3);
        check3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    text3.setEnabled(true);
                    text3.setEnabled("");
                } else {
                    text3.setEnabled(false);
                    text3.setEnabled("");
                }
            });
        }
        check4(CheckBox) findViewById(R.id.checkBox4);
        check4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    text4.setEnabled(true);
                    text4.setEnabled("");
                } else {
                    text4.setEnabled(false);
                    text4.setEnabled("");
                }
            });
        }
        public perintahTombolPesan(){
            check1 = (CheckBox) findViewById(R.id.checkBox1);
            check2 = (CheckBox) findViewById(R.id.checkBox2);
            check3 = (CheckBox) findViewById(R.id.checkBox3);
            check4 = (CheckBox) findViewById(R.id.checkBox4);
            pesan = (Button) findViewById(R.id.btnpesan);

            btnpesan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (v == btnLogin) ;
                    if (editUsername.getText().toString().equals(user) && Password.getText().toString().equals(pass))
                        ;
                    Toast.makeText(getApplicationContext(), "Login Anda Berhasil uwa", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(MainActivity.this, MenuActivity.class);
                    startActivity(i);
                } else{
                    Toast.makeText(getApplicationContext(), "Login gagal", Toast.LENGTH_LONG).show();
                    editUsername.setText("");
                    Password.setText("");
                    editUsername.requestFocus();
                }
            });
        }
    }