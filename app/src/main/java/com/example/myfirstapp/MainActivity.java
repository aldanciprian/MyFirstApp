package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    public final static String STATE_DE_SALVAT= "key_DE_SALVAT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView threadName = new TextView(this);
        //threadName.setTextSize(100);
        //threadName.setText("testare");
//        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_main);
//        threadName.setText(Integer.toString(android.os.Process.myTid()));
//        layout.addView(threadName);
        //addContentView(threadName,null);

    }
    /** Called when the user clicks the Send button */
    public void sendMessage(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceSate) {
        savedInstanceSate.putInt(STATE_DE_SALVAT,5);
        super.onSaveInstanceState(savedInstanceSate);
    }
}
