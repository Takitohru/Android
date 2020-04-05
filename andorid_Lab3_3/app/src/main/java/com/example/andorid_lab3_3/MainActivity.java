package com.example.andorid_lab3_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.my_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.TextSizeMenuItem1:
                editText=(EditText)findViewById(R.id.editText);
                editText.setTextSize(10);
                return true;
            case R.id.TextSizeMenuItem2:
                editText=(EditText)findViewById(R.id.editText);
                editText.setTextSize(16);
                return true;
            case R.id.TextSizeMenuItem3:
                editText=(EditText)findViewById(R.id.editText);
                editText.setTextSize(20);
                return true;
            case R.id.item2:
                Toast.makeText(this, "selected " + item.getTitle(), Toast.LENGTH_SHORT).show();
                return super.onOptionsItemSelected(item);
            case R.id.submenuBlack:
                editText=(EditText)findViewById(R.id.editText);
                editText.setTextColor(Color.BLACK);
                return true;
            case R.id.submenuRed:
                editText=(EditText)findViewById(R.id.editText);
                editText.setTextColor(Color.RED);
                return true;
                default:return true;
        }
    }
}