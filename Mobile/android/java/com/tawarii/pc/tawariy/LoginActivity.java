package com.tawarii.pc.tawariy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class LoginActivity extends AppCompatActivity {

    EditText edEmail, edPassword;
    TextView content;
    Button bLogin;
    public static TextView data;


    String stEmail, stPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        edEmail = (EditText) findViewById(R.id.edEmail);
        edPassword = (EditText) findViewById(R.id.edPassword);

        bLogin = (Button) findViewById(R.id.bLogin);
        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {

                    findVolonteer();
                } catch (Exception ex) {
                    content.setText(" url exeption! ");
                }

            }
        });


    }

    private void findVolonteer() throws UnsupportedEncodingException {

        stEmail = edEmail.getText().toString();
        stPassword = edPassword.getText().toString();

    }
}




