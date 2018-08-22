package com.sagensoren.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void Convert(View view){
        EditText RupeeAmountEditText=findViewById(R.id.RupeeAmountEditText);

        Double RupeeAmountDouble=Double.parseDouble(RupeeAmountEditText.getText().toString());

        Double DollerAmount=RupeeAmountDouble*0.016;

        Toast.makeText(MainActivity.this," $"+String.format("%.2f",DollerAmount),Toast.LENGTH_SHORT).show();
        Log.i("amount",RupeeAmountEditText.getText().toString());


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
