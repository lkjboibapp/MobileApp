package com.example.hellokitty.mobileapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class How_to extends AppCompatActivity {

    private Toolbar mTopToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_to);


        mTopToolbar = (Toolbar) findViewById(R.id.toolbar1);
        setSupportActionBar(mTopToolbar);

    }


    @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.actionbarhowto, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item){
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            int id = item.getItemId();

            //noinspection SimplifiableIfStatement
            if (id == R.id.action_favorite) {
                Toast.makeText(How_to.this, "Action clicked", Toast.LENGTH_LONG).show();
                return true;
            }

            return super.onOptionsItemSelected(item);
        }

}
