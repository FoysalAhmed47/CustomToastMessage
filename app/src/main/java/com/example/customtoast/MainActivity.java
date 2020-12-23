package com.example.customtoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=(Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MyToast();
            }
        });
    }

    public void MyToast()
    {
        LayoutInflater li=getLayoutInflater(); //Instance of LayoutInflater
        View layout=li.inflate(R.layout.customtoast,(ViewGroup)findViewById(R.id.custom_toast_id));
        Toast toast=new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL,0,0); //Toast mobile er screen er kon position a show korbe seta ble dibe
        toast.setView(layout);
        toast.show();

    }
}
