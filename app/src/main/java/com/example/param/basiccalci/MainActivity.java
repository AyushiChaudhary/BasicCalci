package com.example.param.basiccalci;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
      EditText e1;
      double num1=0.0;
      double num2=0.0;
      double result=0.0;
      String operation="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.etNum);
    }

    public void onClickOne(View v){
        Button b1=(Button)findViewById(R.id.btOne);
        String s1=e1.getText().toString()+b1.getText().toString();
        e1.setText(s1);

    }
    public void onClickTwo(View v){
        Button b1=(Button)findViewById(R.id.btTwo);
        String s1=e1.getText().toString()+b1.getText().toString();
        e1.setText(s1);

    }
    public void onClickThree(View v){
        Button b1=(Button)findViewById(R.id.btThree);
        String s1=e1.getText().toString()+b1.getText().toString();
        e1.setText(s1);

    }
    public void onClickFour(View v){
        Button b1=(Button)findViewById(R.id.btFour);
        String s1=e1.getText().toString()+b1.getText().toString();
        e1.setText(s1);

    }
    public void onClickFive(View v){

        Button b1=(Button)findViewById(R.id.btFive);
        String s1=e1.getText().toString()+b1.getText().toString();
        e1.setText(s1);
    }
    public void onClickSix(View v){
        Button b1=(Button)findViewById(R.id.btSix);
        String s1=e1.getText().toString()+b1.getText().toString();
        e1.setText(s1);
    }
    public void onClickSeven(View v){
        Button b1=(Button)findViewById(R.id.btSeven);
        String s1=e1.getText().toString()+b1.getText().toString();
        e1.setText(s1);

    }
    public void onClickEight(View v){
        Button b1=(Button)findViewById(R.id.btEight);
        String s1=e1.getText().toString()+b1.getText().toString();
        e1.setText(s1);

    }
    public void onClickNine(View v){
        Button b1=(Button)findViewById(R.id.btNine);
        String s1=e1.getText().toString()+b1.getText().toString();
        e1.setText(s1);

    }
    public void onClickTen(View v){
        Button b1=(Button)findViewById(R.id.btZero);
        String s1=e1.getText().toString()+b1.getText().toString();
        e1.setText(s1);

    }
    public void onClickAdd(View v){
        num1=Double.parseDouble(e1.getText().toString());
        e1.setText("");
        operation="+";


    }
    public void onClickSub(View v) {
        num1=Double.parseDouble(e1.getText().toString());
        e1.setText("");
        operation="-";

    }
    public void onClickMul(View v){
        num1=Double.parseDouble(e1.getText().toString());
        e1.setText("");
        operation="*";

    }
    public void onClickDiv(View v){
        num1=Double.parseDouble(e1.getText().toString());
        e1.setText("");
        operation="/";

    }
    public void onClickDot(View v){
        Button b1=(Button)findViewById(R.id.btDot);
        String s1=e1.getText().toString()+b1.getText().toString();
    }
    public void onClickClear(View v){
        e1.setText("");


    }
    public void onClickEqual(View v){
        num2=Double.parseDouble(e1.getText().toString());
        if(operation.equals("+")){
            result=num1+num2;
            e1.setText(String.valueOf(result));

        }
        else if(operation.equals("-")){
            result=num1-num2;
            e1.setText(String.valueOf(result));

        }
       else if(operation.equals("*")){
            result=num1*num2;
            e1.setText(String.valueOf(result));

        }
        else if(operation.equals("/")){
            result=num1/num2;
            e1.setText(String.valueOf(result));

        }
        else{
            AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
            builder.setTitle("Alert!!");
            builder.setMessage("Select an Operator");
           // builder.setNegativeButton("Cancle",null)
            builder.setPositiveButton("Ok",null);
            builder.setCancelable(false);
            AlertDialog alert=builder.create();
            alert.show();

        }

    }


    }