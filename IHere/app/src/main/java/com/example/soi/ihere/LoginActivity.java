package com.example.soi.ihere;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import com.example.soi.ihere.model.User;

public class LoginActivity extends AppCompatActivity{

    Button btnLogin, btnExit;
    EditText userName, password;
    TextView register;
    Switch remember;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //maping code and xml
        btnLogin = (Button) findViewById(R.id.lgBtnLogin);
        btnExit = (Button) findViewById(R.id.lgBtnExit);
        userName = (EditText) findViewById(R.id.lgTxtUserName);
        password = (EditText) findViewById(R.id.lgTxtPassword);
        register = (TextView) findViewById(R.id.lgTxtRegister);
        remember = (Switch) findViewById(R.id.lgSwRememberAccount);




        //set onclick
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user, pass;
                user = userName.getText().toString();
                pass = password.getText().toString();
                if(user.length() == 0 || pass.length() == 0) {
                    AlertDialog alertDialog = new AlertDialog.Builder(LoginActivity.this).create();
                    alertDialog.setTitle("Username or password is blank");
                    alertDialog.setMessage("You need to fill in all fields username and password");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();

                }
                User userTmp = new User();
            }
        });
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        remember.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

            }
        });
    }
}
