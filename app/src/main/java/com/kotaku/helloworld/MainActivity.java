package com.kotaku.helloworld;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button countButton;
    private TextView textNumber;
    int mCount=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countButton=findViewById(R.id.Button2);
        textNumber=findViewById(R.id.TextNumber);

        countButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCount();
            }
        });
    }

    public void OpenToast(View view) {
        Toast.makeText(this,"HELLO TOAST", Toast.LENGTH_LONG).show();
    }
    public void showCount() {
        mCount++;
        if(textNumber!=null) {
            textNumber.setText(mCount+"");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.optionmenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.menu1) {
            Intent intent=new Intent(this, Menu1Activity.class);
            startActivity(intent);

        } else if(item.getItemId()==R.id.menu2) {
            Intent intent=new Intent(this, Menu2Activity.class);
            startActivity(intent);

        } else if(item.getItemId()==R.id.menu3) {
            Intent intent=new Intent(this, Menu3Activity.class);
            startActivity(intent);

        }
        return true;
    }
}