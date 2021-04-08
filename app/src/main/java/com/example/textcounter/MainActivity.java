package com.example.textcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {


    private TextInputEditText textBox;
    private Button calcButton;
    private TextView result1;
    private TextView result2;
    private TextView result3;
    String text;
    String textWithoutReturn;
    String textWithoutReturnAndSpace;
    int number1;
    int number2;
    int number3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textBox = (TextInputEditText) this.findViewById(R.id.textBox);
        calcButton = (Button) this.findViewById(R.id.calcButton);
        result1 = (TextView) this.findViewById(R.id.result1);
        result2 = (TextView) this.findViewById(R.id.result2);
        result3 = (TextView) this.findViewById(R.id.result3);

        calcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = textBox.getText().toString();
                textWithoutReturn = text.replaceAll("\n", "");
                textWithoutReturnAndSpace = textWithoutReturn.replaceAll("\\s|", "");

                number1 = text.length();
                number2 = textWithoutReturn.length();
                number3 = textWithoutReturnAndSpace.length();

                result1.setText(number1 + "文字");
                result2.setText(number2 + "文字");
                result3.setText(number3 + "文字");

            }
        });


    }
}