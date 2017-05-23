package com.example.android.booklistingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.R.id.message;
import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class BookListingStartActivity extends AppCompatActivity {

    public static final String AUTHOR = "author";
    public static final String TITLE = "title";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_activity);
    }

    public void sendData(View view) {
        Intent intent = new Intent(this, ListActivity.class);

        EditText titleText = (EditText) findViewById(R.id.search_title);
        String titleInput = titleText.getText().toString();

        EditText authorText = (EditText) findViewById(R.id.search_author);
        String authorInput = authorText.getText().toString();

        intent.putExtra(TITLE, titleInput);
        intent.putExtra(AUTHOR, authorInput);
        startActivity(intent);
    }
}