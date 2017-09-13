package com.example.limingkun.duihuakuang;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Duihuakuang extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_duihuakuang);
        Button bt1 = (Button) findViewById(R.id.button1);




        Button bt2 = (Button) findViewById(R.id.button2);



        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Duihuakuang.this);
                builder.setMessage("请输入登录名和密码").setTitle("提示");
                builder.show();



            }
        });

        bt2.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Duihuakuang.this);
                LayoutInflater inflater = getLayoutInflater();
                final View view = inflater.inflate(R.layout.tishi,null);
                builder.setView(view)
                        .setTitle("Login")
                        .setPositiveButton(R.string.logan, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {

                                EditText userInput1 = (EditText)view.findViewById(R.id.editTextUserId);
                                  String a=userInput1.getText().toString();
                                EditText userInput2 = (EditText)view.findViewById(R.id.editTextPwd);
                                  String b=userInput2.getText().toString();
                                if (b.equals("123") && a.equals("abc")){
                                    Toast.makeText(Duihuakuang.this, "登陆成功", Toast.LENGTH_LONG).show();

                                }
                                else{
                                    Toast.makeText(Duihuakuang.this, "登陆失败", Toast.LENGTH_LONG).show();


                                }
                            }
                        })
                        .setNegativeButton(R.string.cancal, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                            }
                        });
                builder.show();



            }
        });
    }
}