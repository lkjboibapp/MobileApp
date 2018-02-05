package com.example.hellokitty.mobileapplication;

import android.app.LocalActivityManager;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

import com.mindorks.placeholderview.PlaceHolderView;
import com.mindorks.placeholderview.annotations.Layout;

@Layout(R.layout.toolbar_buttom)
public class MainActivity extends AppCompatActivity {

    private PlaceHolderView mDrawerView;
    private DrawerLayout mDrawer;
    private Toolbar mToolbar, tabHost;
    private PlaceHolderView mGalleryView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mDrawer = (DrawerLayout) findViewById(R.id.drawerLayout);
        mDrawerView = (PlaceHolderView) findViewById(R.id.drawerView);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);

        mGalleryView = (PlaceHolderView) findViewById(R.id.galleryView);
        setupDrawer();


        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener
                (new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        Fragment selectedFragment = null;
                        switch (item.getItemId()) {
                            case R.id.action_item1:
                                selectedFragment = FirstFragment.newInstance();
                                break;
                            case R.id.action_item2:
                                selectedFragment = SecondFragment.newInstance();
                                break;
                            case R.id.action_item3:
                                selectedFragment = ThirdFrament.newInstance();
                                break;
                        }
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.frame_layout, selectedFragment);
                        transaction.commit();
                        return true;
                    }
                });

        //Manually displaying the first fragment - one time only
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout, FirstFragment.newInstance());
        transaction.commit();

    }


    //ส่วนแฮมเบอเกอร์
    private void setupDrawer() {
        mDrawerView
                .addView(new DrawerHeader())
                .addView(new DrawerMenuItem(this.getApplicationContext(), DrawerMenuItem.DRAWER_MENU_ITEM_First_Page))
                .addView(new DrawerMenuItem(this.getApplicationContext(), DrawerMenuItem.DRAWER_MENU_ITEM_About_Us))
                .addView(new DrawerMenuItem(this.getApplicationContext(), DrawerMenuItem.DRAWER_MENU_ITEM_Course))
                .addView(new DrawerMenuItem(this.getApplicationContext(), DrawerMenuItem.DRAWER_MENU_ITEM_How_to))
                .addView(new DrawerMenuItem(this.getApplicationContext(), DrawerMenuItem.DRAWER_MENU_ITEM_Question))
                .addView(new DrawerMenuItem(this.getApplicationContext(), DrawerMenuItem.DRAWER_MENU_ITEM_Contact_Us))
                .addView(new DrawerMenuItem(this.getApplicationContext(), DrawerMenuItem.DRAWER_MENU_ITEM_Search));

        ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle(this, mDrawer, mToolbar, R.string.backdrop_title, R.string.backdrop_subtitle) {


            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);


            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }
        };


        mDrawer.addDrawerListener(drawerToggle);

        drawerToggle.syncState();


    }


   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.home2) {
            //Do something
            return true;
        } else if (id == R.id.home3) {
            //Do something
            return true;
        } else if (id == R.id.home1) {
            //Do something
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/

}
