package com.caiiiyua.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Button.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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

    @Override
    public void onResume() {
        super.onResume();
        Button p1 = (Button) findViewById(R.id.p1);
        Button p2 = (Button) findViewById(R.id.p2);
        Button p3 = (Button) findViewById(R.id.p3);
        Button p4 = (Button) findViewById(R.id.p4);
        Button p5 = (Button) findViewById(R.id.p5);
        p1.setOnClickListener(MainActivity.this);
        p2.setOnClickListener(MainActivity.this);
        p3.setOnClickListener(MainActivity.this);
        p4.setOnClickListener(MainActivity.this);
        p5.setOnClickListener(MainActivity.this);
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.p1:
                Toast.makeText(MainActivity.this, "My project 1", Toast.LENGTH_LONG).show();
            case R.id.p2:
                Toast.makeText(MainActivity.this, "My project 2", Toast.LENGTH_LONG).show();
            case R.id.p3:
                Toast.makeText(MainActivity.this, "My project 3", Toast.LENGTH_LONG).show();
            case R.id.p4:
                Toast.makeText(MainActivity.this, "My project 4", Toast.LENGTH_LONG).show();
            case R.id.p5:
                Toast.makeText(MainActivity.this, "My project 5", Toast.LENGTH_LONG).show();
        }
    }
}
