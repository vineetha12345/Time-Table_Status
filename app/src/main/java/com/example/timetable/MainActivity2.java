package com.example.timetable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity2 extends AppCompatActivity {
    EditText e21,e22,e23,e24,e25,e26,e27,e28;
    Button b21;
    FirebaseDatabase f1;
    DatabaseReference r1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b21=(Button)findViewById(R.id.btninsert);
        e21=(EditText)findViewById(R.id.nam2);
        e22=(EditText)findViewById(R.id.tea2);
        e23=(EditText)findViewById(R.id.sub2);
        e24=(EditText)findViewById(R.id.bran2);
        e25=(EditText)findViewById(R.id.day2);
        e26=(EditText)findViewById(R.id.per2);
        e27=(EditText)findViewById(R.id.cla2);
        e28=(EditText)findViewById(R.id.sta2);
        f1=FirebaseDatabase.getInstance();
        r1=f1.getReference("users");
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f1=FirebaseDatabase.getInstance();
                r1=f1.getReference("users");
                String name=e21.getEditableText().toString();
                String teacherid=e22.getText().toString();
                String subject=e23.getText().toString();
                String branch=e24.getText().toString();
                String day=e25.getText().toString();
                String period=e26.getText().toString();
                String class2=e27.getText().toString();
                String status=e28.getText().toString();

                users hc = new users(name,teacherid,subject,branch,day,period,class2,status);
               r1.child(teacherid).setValue(hc);
            }
        });
    }
}