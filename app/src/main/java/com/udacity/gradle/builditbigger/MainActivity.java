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

import java.util.concurrent.ExecutionException;

import garrison.com.jokerapp.JokerMainActivity;

public class MainActivity extends ActionBarActivity {

    public static final String JOKE_STRING = "joke_string";
    String myJoke = "";


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
        String result = "";
        EndpointsAsyncTask endpointAsyncTask = (EndpointsAsyncTask) new EndpointsAsyncTask().execute(new Pair<Context, String>(this, null));
        try {
            result = endpointAsyncTask.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        Toast.makeText(this, result, Toast.LENGTH_LONG).show();

    }

    public void setJoke(String joke) {
        myJoke = joke;
        Toast.makeText(this, joke, Toast.LENGTH_LONG).show();
    }

}
