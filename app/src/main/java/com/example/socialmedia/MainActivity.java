package com.example.socialmedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //views
    Button mRegisterBtn, mLoginBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //init views
        mRegisterBtn = findViewById(R.id.register_btn);
        mLoginBtn = findViewById(R.id.login_btn);

        //handle register button click
        mRegisterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                //start RegisterActivity
                startActivity(new Intent(MainActivity.this, RegisterActivity.class));
            }
        });
        //handle login button click
        mLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //start LoginActivity
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            }
        });
    }
}

/* Part 01
01-Add internet permission (required for firebase)
02-Add Register and Login Buttons in MainActivity
03-Create RegisterActivity
04-Create Firebase Project and connect app with that project
05-Check google-services.json file to make sure app is connected with firebase
06-User Registration using Email & Password
07-Create ProfileActivity
08-Go to Profile Activity After Register/Login

In Next Part 2 with Login Feature
09-Make ProfileActivity Launcher
10-Add Log out Feature

Part 05
01- Save registered user's info(name, email, uid, phone, image)
    in firebase realtime database.
    Requirements:
    i) Add Firebase Realtime database
    ii) Change firebase realtime database rules
02- Add Bottom Navigation in Profile Activity having three menus:
    i) Home
    ii)Analytics
    iii)Other
 */
