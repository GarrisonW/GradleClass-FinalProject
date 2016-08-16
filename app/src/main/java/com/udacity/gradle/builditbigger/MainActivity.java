package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.Joker;

import garrison.com.jokerapp.JokerMainActivity;

public class MainActivity extends ActionBarActivity {

    public static final String JOKE_STRING = "joke_string";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void launchJavaJoke(View view){
        Joker joker = new Joker();
        String joke  = joker.getJoke();
        Toast.makeText(this, joke, Toast.LENGTH_SHORT).show();
    }

    public void launchAppJoke(View view) {
        Intent intent = new Intent(this, JokerMainActivity.class);
        intent.putExtra(JOKE_STRING, getString(R.string.app_joke));
        startActivity(intent);
    }

    public void launchGTEJoke(View view) {
       new EndpointsAsyncTask().execute(new Pair<Context, String>(this, null));
       // new EndpointsAsyncTask().execute(this);
    }

}
