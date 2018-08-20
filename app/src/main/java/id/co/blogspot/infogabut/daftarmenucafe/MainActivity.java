package id.co.blogspot.infogabut.daftarmenucafe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editUsername;
    private EditText Password;
    private Button btnLogin;
    String user, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editUsername = (EditText) findViewById(R.id.editUsername);
        editUsername.getText();
        Password = (EditText) findViewById(R.id.Password);
        Password.getText();
        btnLogin = (Button) findViewById(R.id.btnLogin);

        user = "ra";
        pass = "ra";

        btnLogin.setOnClickListener(new View.OnClickListener() {
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