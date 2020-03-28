package com.example.gift_house1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import io.paperdb.Paper;

public class HomeActivity extends AppCompatActivity
{
    private Button logoutBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        logoutBtn = (Button) findViewById(R.id.logout_btn);


        logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Paper.book().destroy();

                Intent intent=new Intent(HomeActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });


    }
}
