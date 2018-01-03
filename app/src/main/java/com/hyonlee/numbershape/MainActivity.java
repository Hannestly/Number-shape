package com.hyonlee.numbershape;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int inputNumber;

    /*
    Activated when the user presses the check button.
    calls two functions that returns boolean value after checking if the entered value is a triangle or square value
     */
    public void checkValue(View view){
        EditText number = (EditText) findViewById(R.id.input);
        inputNumber = Integer.parseInt(number.getText().toString());
        String message = "";
        if(isTriangle()){
            if(isSquare()){
                message = "the number is both square and triangle";
            }
            message = "the number is triangle";
        }else if(isSquare()){
            message = "the number is square";
        }else{
            message = "the number is neither";
        }
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    /**
     * Checks if the input value is a triangle value
     * @return If the entered value is triangle, returns boolean value of 'true', if not 'false'
     */
    public boolean isTriangle(){
        int n = 1;
        int TriangleNum =1;
        while(TriangleNum < inputNumber){
            n++;
            TriangleNum = TriangleNum +n;
        }
        if(TriangleNum == inputNumber){
            return true;
        }else{
            return false;
        }
    }

    /**
     * Checks if the input value from the user is square
     * @return if the value is square value, returns boolean value 'true' if not 'false'
     */
    public boolean isSquare(){
        int n = 1;
        int SquareNum =1;
        while(SquareNum < inputNumber){
            n++;
            SquareNum = n*n;
        }
        if(SquareNum == inputNumber){
            return true;
        }else{
            return false;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
