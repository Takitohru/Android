package com.example.andorid_lab3_2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private MainActivity activity;
    private TextView tview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activity = this;

        button1 = (Button) findViewById(R.id.button1);

        button1.setOnClickListener(button1_OnClickListener);
    }
    private View.OnClickListener button1_OnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            AlertDialog dialog = builder.create();
            dialog.setView(View.inflate(activity, R.layout.dialogview, null), 0, 0, 0, 0);
            dialog.show();
        }
    };
}
