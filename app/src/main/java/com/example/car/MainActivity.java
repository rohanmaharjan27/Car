package com.example.car;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv_scrollable;
    private EditText et_make,et_year,et_color,et_price,et_size;
    private Button btn_create;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initItems();
    }

    private void initItems(){
        et_make=findViewById(R.id.et_make);
        et_year=findViewById(R.id.et_year);
        et_color=findViewById(R.id.et_color);
        et_price=findViewById(R.id.et_price);
        et_size=findViewById(R.id.et_size);

        tv_scrollable=findViewById(R.id.tv_scrollable);
        tv_scrollable.setMovementMethod(new ScrollingMovementMethod());

        btn_create=findViewById(R.id.btn_create);
        btn_create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarModel model= new CarModel(et_make.getText().toString(),
                        et_year.getText().toString(),
                        et_color.getText().toString(),
                        et_price.getText().toString(),
                        et_size.getText().toString());

                tv_scrollable.setText(tv_scrollable.getText()+"\r\n"+model.toString());

            }
        });
    }
}
