package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

  @BindView(R.id.editText3)
  EditText Фамилия;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);
  }

  @OnClick(R.id.button)
  public void Two() {
    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
    Bundle b = new Bundle();
    b.putString("Name", Фамилия.getText().toString()); //Your id
    intent.putExtras(b); //Put your id to your next Intent
    startActivity(intent);
  }

 // @OnClick(R.id.button2)
 // public void Two2() {
 //   name.setText("test");

}
