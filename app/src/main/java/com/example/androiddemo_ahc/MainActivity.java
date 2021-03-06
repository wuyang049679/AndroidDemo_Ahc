package com.example.androiddemo_ahc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button=findViewById(R.id.button);
        Button form_btn=findViewById(R.id.form_button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,HtmlActivity.class);
                intent.putExtra("HIDE","hide_no");
                startActivity(intent);
            }
        });
        form_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,HtmlActivity.class);
                intent.putExtra("HIDE","hide_title");
                startActivity(intent);
            }
        });
    }
}
