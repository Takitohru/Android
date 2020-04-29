package com.example.android_lab4url;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText url=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        url=(EditText) findViewById(R.id.editText) ;
        Button urlbutton=(Button) findViewById(R.id.button);
        urlbutton.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        Intent it = new Intent();
                        it.setAction(Intent.ACTION_VIEW);
                        Uri uri = Uri.parse(url.getText().toString().trim());
                        it.setData(uri);
                        startActivity(it);
                    }
                }
        );
    }
}
