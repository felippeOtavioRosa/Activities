package com.example.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    public static final String EXTRA_MESSAGE = "com.example.activities.extra.MESSAGE";
    public static final int TEXT_REQUEST = 1;

    private EditText mMessageEditText;
    private TextView mRepalyHeadTextView; // cabeçalho
    private TextView mReplayTextView; // text view com a mensagem

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void launchSecondActivity(View view) {
        Log.d(TAG, "launchSecondActivity: Botão pressionado");
        //cria o objeto que permite comunicar uma activity com outra
        Intent intent = new Intent(this,SecondActivity.class);
        // obtem o texto digitado no editText
        String message = mMessageEditText.getText().toString();
        // insere mensagem no "balaio" (extra)
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivityForResult(intent, TEXT_REQUEST);
    }
}