package com.hyonlee.numbershape;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    class Number {
        int num;
        /**
         * Checks if the input value is a triangle value
         *
         * @return If the entered value is triangle, returns boolean value of 'true', if not 'false'
         */
        public boolean isTriangle() {
            int n = 1;
            int TriangleNum = 1;
            while (TriangleNum < num) {
                n++;
                TriangleNum = TriangleNum + n;
            }
            if (TriangleNum == num) {
                return true;
            } else {
                return false;
            }
        }

            /**
             * Checks if the input value from the user is square
             * @return if the value is square value, returns boolean value 'true' if not 'false'
             */

        public boolean isSquare() {
            int y = 1;
            int SquareNum = 1;
            while (SquareNum < num) {
                y++;
                SquareNum = y * y;
            }
            if (SquareNum == num) {
                return true;
            } else {
                return false;
            }
        }
    }

        /*
        Activated when the user presses the check button.
        calls two functions that returns boolean value after checking if the entered value is a triangle or square value
        */
        public void checkValue(View view){
            Number inputNumber = new Number();
            EditText number = (EditText) findViewById(R.id.input);
            if(number.getText().toString().isEmpty()){
                Toast.makeText(getApplicationContext(), "Please enter a value", Toast.LENGTH_SHORT).show();
            }else {


                inputNumber.num = Integer.parseInt(number.getText().toString());

                String message = "";
                if (inputNumber.isTriangle()) {
                    if (inputNumber.isSquare()) {
                        message = "the number is both square and triangle";
                    }
                    message = "the number is triangle";
                } else if (inputNumber.isSquare()) {
                    message = "the number is square";
                } else {
                    message = "the number is neither";
                }
                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
            }
        }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
