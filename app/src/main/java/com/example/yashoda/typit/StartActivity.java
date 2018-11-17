package com.example.yashoda.typit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {


        private Button mReagBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        mReagBtn=(Button) findViewById(R.id.start_reg_btn);
        mReagBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent reg_intent= new Intent(StartActivity.this, RegisterActivity.class);
                startActivity(reg_intent);
            }
        });
    }
}
